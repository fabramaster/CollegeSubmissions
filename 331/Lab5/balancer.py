from http.server import BaseHTTPRequestHandler, HTTPServer
import sys
from urllib import parse
import os

hostName = "localhost"
serverPort = 80
# List of available math service ports
ports = ["8080", "8081"]

class MyServer(BaseHTTPRequestHandler):    
    def do_GET(self):
        try:
            # Get the number parameter from the request
            params = self.getParams()
            number = params.get('number', None)
            
            if number is None:
                self.send_error(400, "Missing 'number' parameter")
                return
                
            try:
                # Validate number is integer
                number = int(number)
            except ValueError:
                self.send_error(400, "Invalid number format")
                return
            
            # Read the skeleton HTML file
            try:
                with open('skeleton.html', 'r') as file:
                    html_content = file.read()
            except FileNotFoundError:
                self.send_error(500, "Skeleton HTML template not found")
                return
            
            if not ports:
                self.send_error(503, "No available services")
                return
                
            # Get the first available port
            current_port = ports[0]
            
            # Rotate the ports list for round-robin
            ports.append(ports.pop(0))
            
            # Replace the placeholders in the HTML
            html_content = html_content.replace('*NUM*', str(number))
            html_content = html_content.replace('*PORT*', current_port)
            
            # Send the modified HTML to client
            self.set_headers(200)
            self.wfile.write(html_content.encode('utf-8'))
            
            # Log the request
            print(f"Forwarded request for number {number} to service on port {current_port}")
            
        except Exception as e:
            print(f"Error processing request: {str(e)}")
            self.send_error(500, "Internal server error")
    
    def getParams(self):
        output = {}
        queryList = parse.parse_qs(parse.urlsplit(self.path).query)
        for key in queryList:
            if len(queryList[key]) == 1:
                output[key] = queryList[key][0]
        return output
    
    def set_headers(self, responseCode):
        self.send_response(responseCode)
        self.send_header("Content-type", "text/html")
        self.send_header('Access-Control-Allow-Origin', "*")
        self.send_header('Access-Control-Allow-Headers', "*")
        self.end_headers()

if __name__ == "__main__":        
    # Validate that skeleton.html exists
    if not os.path.exists('skeleton.html'):
        print("Error: skeleton.html not found in current directory")
        sys.exit(1)
        
    # Validate that we have ports configured
    if not ports:
        print("Error: No service ports configured")
        sys.exit(1)
    
    webServer = HTTPServer((hostName, serverPort), MyServer)
    print(f"Load balancer started http://{hostName}:{serverPort}")
    print(f"Routing traffic to ports: {', '.join(ports)}")
    
    try:
        webServer.serve_forever()
    except KeyboardInterrupt:
        pass
    finally:
        webServer.server_close()
        print("Load balancer stopped.")
        sys.exit()
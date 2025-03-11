from http.server import BaseHTTPRequestHandler, HTTPServer
import sys
from urllib import parse
import json

hostName = "localhost"
serverPort = 8080

class MyServer(BaseHTTPRequestHandler):    
    def do_GET(self):
        try:
            # Get parameters
            params = self.getParams()
            number = params.get('number', None)
            
            if number is None:
                self.send_error(400, "Missing 'number' parameter")
                return
                
            try:
                number = int(number)
            except ValueError:
                self.send_error(400, "Invalid number format")
                return
                
            # Calculate triangle number
            output = sum(range(number + 1))
            
            # Send response
            self.set_headers(200)
            response = json.dumps({
                "input": number,
                "result": output
            })
            self.wfile.write(response.encode('utf-8'))
            
            # Log to console
            print(f"Calculated triangle number for {number}: {output}")
            
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
        self.send_header("Content-type", "application/json")
        self.send_header('Access-Control-Allow-Origin', "*")
        self.send_header('Access-Control-Allow-Headers', "*")
        self.end_headers()

if __name__ == "__main__":        
    webServer = HTTPServer((hostName, serverPort), MyServer)
    print(f"Server started http://{hostName}:{serverPort}")
    try:
        webServer.serve_forever()
    except KeyboardInterrupt:
        pass
    finally:
        webServer.server_close()
        print("Server stopped.")
        sys.exit()
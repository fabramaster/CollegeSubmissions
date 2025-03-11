from http.server import BaseHTTPRequestHandler, HTTPServer
import sys, time, uuid
from urllib import parse
import urllib.request

hostName = "localhost"
serverPort = 80

class MyServer(BaseHTTPRequestHandler):
    tokens = {}

    # Set the HTTP status code and response headers
    def set_headers(self, responseCode):
        self.send_response(responseCode)
        self.send_header("Content-type", "text/html")
        self.send_header('Access-Control-Allow-Origin', "*")
        self.send_header('Access-Control-Allow-Headers', "*")
        self.end_headers()

    def do_GET(self):
        print("GET REQUEST")
        path = self.getPage()

        if path == "/secure_resource":
            params = self.getParams()
            token = params.get("token", None)
            if token and self.getToken(token):
                self.set_headers(200)
                capybara_info = (
                    "Capybaras are the coolest animal on the planet, hands down fr fr no cap on god they bussin "
                )
                self.wfile.write(bytes(capybara_info, "utf-8"))
            else:
                self.set_headers(401)
                self.wfile.write(bytes("Unauthorized access", "utf-8"))

    def getToken(self, token):
        # Simulate token caching with a TTL (Time-To-Live)
        current_time = time.time()
        if token in self.tokens:
            token_issue_time = self.tokens[token]
            # Token is valid for 60 minutes
            if current_time - token_issue_time < 3600:
                return True
        # Token is either not present or expired
        new_token = str(uuid.uuid4())
        self.tokens[new_token] = current_time
        return False

    # Gets the query parameters of a request and returns them as a dictionary
    def getParams(self):
        output = {}
        queryList = parse.parse_qs(parse.urlsplit(self.path).query)
        for key in queryList:
            if len(queryList[key]) == 1:
                output[key] = queryList[key][0]
        return output

    # Returns a string containing the page (path) that the request was for
    def getPage(self):
        return parse.urlsplit(self.path).path

if __name__ == "__main__":
    webServer = HTTPServer((hostName, serverPort), MyServer)
    print("Server started at 127.0.0.1:80")
    try:
        webServer.serve_forever()
    except:
        webServer.server_close()
        print("Server stopped.")
        sys.exit()
    webServer.server_close()
    print("Server stopped.")
    sys.exit()

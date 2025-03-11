from http.server import BaseHTTPRequestHandler, HTTPServer
import sys, uuid
from urllib import parse

hostName = "localhost"
serverPort = 8080

class MyServer(BaseHTTPRequestHandler):
    tokens = {}
    logins = {"myUser": "myPassword"}

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

        if path == "/check_token":
            query_params = self.getRequestData()
            token = query_params.get("token", None)
            if token and token in self.tokens.values():
                self.set_headers(200)
                self.wfile.write(bytes("Token is valid", "utf-8"))
            else:
                self.set_headers(401)
                self.wfile.write(bytes("Invalid token", "utf-8"))

    def do_POST(self):
        print("POST REQUEST")
        path = self.getPage()
        data = self.getRequestData()

        if path == "/login":
            username = data.get("username", None)
            password = data.get("password", None)
            if username in self.logins and self.logins[username] == password:
                token = str(uuid.uuid4())
                self.tokens[username] = token
                self.set_headers(200)
                self.wfile.write(bytes(f"Login successful. Token: {token}", "utf-8"))
            else:
                self.set_headers(401)
                self.wfile.write(bytes("Invalid credentials", "utf-8"))

    # Fetches the requested path
    def getPage(self):
        return parse.urlsplit(self.path).path

    # Fetches the request body data (i.e. POST request parameters)
    def getRequestData(self):
        body = self.rfile.read(int(self.headers.get('Content-Length')))
        body = body.decode("utf-8")
        return dict(parse.parse_qsl(body))

if __name__ == "__main__":
    webServer = HTTPServer((hostName, serverPort), MyServer)
    print("Server started http://%s:%s" % (hostName, serverPort))
    try:
        webServer.serve_forever()
    except:
        webServer.server_close()
        print("Server stopped.")
        sys.exit()
    webServer.server_close()
    print("Server stopped.")
    sys.exit()

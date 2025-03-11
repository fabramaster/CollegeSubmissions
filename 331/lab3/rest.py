# -*- coding: utf-8 -*-
from http.server import BaseHTTPRequestHandler, HTTPServer
import time, json
from urllib import parse
from json import JSONDecodeError

hostName = "localhost"
serverPort = 8080

class MyServer(BaseHTTPRequestHandler):
    myDict = {}

    # Set HTTP headers
    def set_headers(self, statusCode):
        self.send_response(statusCode)
        self.send_header("Content-type", "text/html")
        self.send_header('Access-Control-Allow-Origin', "*")
        self.send_header('Access-Control-Allow-Headers', "*")
        self.send_header('Access-Control-Allow-Methods', "GET, POST, PUT, DELETE, PATCH, OPTIONS")
        self.end_headers()

    def do_GET(self):
        print("GET REQUEST")
        uri = self.getURI()
        params = self.getParams()

        if uri in self.myDict:
            if 'key' in params:
                key = params['key']
                if key in self.myDict[uri]:
                    self.set_headers(200)
                    self.wfile.write(bytes(json.dumps({key: self.myDict[uri][key]}), "utf-8"))
                else:
                    self.set_headers(404)
                    self.wfile.write(bytes("Key not found", "utf-8"))
            else:
                self.set_headers(200)
                self.wfile.write(bytes(json.dumps(self.myDict[uri]), "utf-8"))
        else:
            self.set_headers(404)
            self.wfile.write(bytes("URI not found", "utf-8"))

    def do_POST(self):
        print("POST REQUEST")
        uri = self.getURI()

        if uri in self.myDict:
            self.set_headers(409)
            self.wfile.write(bytes("Conflict: URI already exists", "utf-8"))
        else:
            try:
                body = self.getBody()
                data = json.loads(body)
                if isinstance(data, dict):
                    self.myDict[uri] = data
                    self.set_headers(201)
                    self.wfile.write(bytes("Created", "utf-8"))
                else:
                    self.set_headers(400)
                    self.wfile.write(bytes("Bad Request: Invalid JSON object", "utf-8"))
            except JSONDecodeError:
                self.set_headers(400)
                self.wfile.write(bytes("Bad Request: Invalid JSON", "utf-8"))

    def do_PUT(self):
        print("PUT REQUEST")
        uri = self.getURI()

        if uri not in self.myDict:
            self.set_headers(404)
            self.wfile.write(bytes("Not Found: URI does not exist", "utf-8"))
        else:
            try:
                body = self.getBody()
                data = json.loads(body)
                if isinstance(data, dict):
                    self.myDict[uri] = data
                    self.set_headers(200)
                    self.wfile.write(bytes("OK", "utf-8"))
                else:
                    self.set_headers(400)
                    self.wfile.write(bytes("Bad Request: Invalid JSON object", "utf-8"))
            except JSONDecodeError:
                self.set_headers(400)
                self.wfile.write(bytes("Bad Request: Invalid JSON", "utf-8"))

    def do_DELETE(self):
        print("DELETE REQUEST")
        uri = self.getURI()

        if uri in self.myDict:
            del self.myDict[uri]
            self.set_headers(200)
            self.wfile.write(bytes("Deleted", "utf-8"))
        else:
            self.set_headers(404)
            self.wfile.write(bytes("Not Found: URI does not exist", "utf-8"))

    def do_PATCH(self):
        print("PATCH REQUEST")
        uri = self.getURI()

        if uri not in self.myDict:
            self.set_headers(404)
            self.wfile.write(bytes("Not Found: URI does not exist", "utf-8"))
        else:
            try:
                body = self.getBody()
                new_data = json.loads(body)
                if isinstance(new_data, dict):
                    self.myDict[uri].update(new_data)
                    self.set_headers(200)
                    self.wfile.write(bytes("OK", "utf-8"))
                else:
                    self.set_headers(400)
                    self.wfile.write(bytes("Bad Request: Invalid JSON object", "utf-8"))
            except JSONDecodeError:
                self.set_headers(400)
                self.wfile.write(bytes("Bad Request: Invalid JSON", "utf-8"))

    def do_OPTIONS(self):
        self.set_headers(200)

    # Retrieve the current URI that has been requested by the client
    def getURI(self):
        return parse.urlsplit(self.path).path

    # Get query string parameters that were part of the request
    def getParams(self):
        output = {}
        queryList = parse.parse_qs(parse.urlsplit(self.path).query)
        for key in queryList:
            if len(queryList[key]) == 1:
                output[key] = queryList[key][0]
        return output

    # Retrieve the request body data
    def getBody(self):
        return self.rfile.read(int(self.headers.get('Content-Length')))

if __name__ == "__main__":
    webServer = HTTPServer((hostName, serverPort), MyServer)
    print("Server started http://%s:%s" % (hostName, serverPort))
    webServer.serve_forever()

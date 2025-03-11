from http.server import BaseHTTPRequestHandler, HTTPServer
import base64
from urllib import parse
import sys

hostName = "localhost"
serverPort = 8080

class EncryptionServer(BaseHTTPRequestHandler):
    def do_GET(self):
        self.send_response(200)
        self.send_header("Content-type", "text/html")
        self.send_header("Access-Control-Allow-Origin", "*")
        self.end_headers()
        
        path = self.get_path()
        if path == '/':
            self.serve_homepage()
        elif path == '/encrypt':
            self.handle_encrypt()
        elif path == '/decrypt':
            self.handle_decrypt()

    def serve_homepage(self):
        with open("encryptionBase.html", "r") as html_file:
            html_content = html_file.read()
        self.wfile.write(bytes(html_content.replace("_PLACEHOLDER_", "You have not encrypted or decrypted anything."), "utf-8"))

    def handle_encrypt(self):
        params = self.get_params()
        encrypted_text = self.encrypt(params['key'], params['plaintext'])
        self.wfile.write(encrypted_text)

    def handle_decrypt(self):
        params = self.get_params()
        decrypted_text = self.decrypt(params['key'], params['cipherText'])
        self.wfile.write(bytes(decrypted_text, "utf-8"))

    def get_params(self):
        query = parse.parse_qs(parse.urlsplit(self.path).query)
        return {k: v[0] for k, v in query.items()}

    def get_path(self):
        return parse.urlsplit(self.path).path

    def encrypt(self, key, plaintext):
        encrypted = [(ord(plaintext[i]) + ord(key[i % len(key)])) % 256 for i in range(len(plaintext))]
        return base64.urlsafe_b64encode(bytes(encrypted))

    def decrypt(self, key, ciphertext):
        decoded = base64.urlsafe_b64decode(ciphertext)
        decrypted = [chr((256 + decoded[i] - ord(key[i % len(key)])) % 256) for i in range(len(decoded))]
        return "".join(decrypted)

if __name__ == "__main__":
    server = HTTPServer((hostName, serverPort), EncryptionServer)
    print(f"Server started at http://{hostName}:{serverPort}")

    try:
        server.serve_forever()
    except KeyboardInterrupt:
        pass

    server.server_close()
    print("Server stopped.")
    sys.exit()

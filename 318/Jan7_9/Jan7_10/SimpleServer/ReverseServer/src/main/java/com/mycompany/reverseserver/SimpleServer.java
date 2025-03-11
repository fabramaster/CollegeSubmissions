package com.mycompany.reverseserver;

import java.net.*;
import java.io.*;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(2500);
        System.out.println("Server started on port 2500");

        while (true) {
            try {
                Socket client = server.accept();
                System.out.println("Client connected from " + client.getInetAddress());
                
                BufferedReader in = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
                PrintWriter out = new PrintWriter(
                    client.getOutputStream(), true);

                String message;
                // Read messages until client sends a dot (.)
                while ((message = in.readLine()) != null) {
                    if (message.equals(".")) {
                        System.out.println("Client ended connection");
                        break;
                    }
                    String reversed = new StringBuilder(message).reverse().toString();
                    out.println(reversed);
                }
                in.close();
                out.close();
                client.close();
                
            } catch (IOException e) {
                System.err.println("Error handling client: " + e.getMessage());
            }
        }
    }
}
import java.net.*;
import java.io.*;

public class SimpleClient {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("usage: java ReverseClient <host>");
            System.exit(0);
        }

        try {
            
            Socket sock = new Socket(args[0], 2500);
            
           
            BufferedReader userInput = new BufferedReader(
                new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(
                new InputStreamReader(sock.getInputStream()));
            PrintWriter out = new PrintWriter(
                sock.getOutputStream(), true);

            System.out.println("Connected to server. Type messages to reverse (type '.' to quit):");
            
            String message;
            // Read user input until a dot (.) is entered
            while (true) {
                System.out.print("> ");
                message = userInput.readLine();
                
                // Send message to server
                out.println(message);
                
                // If message is a dot, end the program
                if (message.equals(".")) {
                    break;
                }
                
                // Read and display the server's response
                String response = in.readLine();
                System.out.println("Server: " + response);
            }

            // Clean up
            userInput.close();
            in.close();
            out.close();
            sock.close();
            
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + args[0]);
        } catch (IOException e) {
            System.err.println("Error connecting to server: " + e.getMessage());
        }
    }
}
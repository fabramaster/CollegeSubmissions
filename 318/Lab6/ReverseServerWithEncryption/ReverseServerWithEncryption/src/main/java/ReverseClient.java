import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;



public class ReverseClient
{
    public static void main(String[] args) throws UnknownHostException, IOException {
    	Socket sock;
    	// host may be either hostname or IP address
        if (args.length == 0)
            sock = new Socket("localhost", 6868);
        else
        	sock = new Socket(args[0], 6868);


        BufferedReader networkBufferIn = null;
        PrintWriter networkPrinterOut = null;
        BufferedReader localBufferIn = null;

        try {
            // Input stream from server
            networkBufferIn = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            // Input stream from keyboard
            localBufferIn = new BufferedReader(new InputStreamReader(System.in));
            // Output stream to server
            networkPrinterOut = new PrintWriter(sock.getOutputStream(), true);
            String line;
            boolean done;
            do {
                // Read a line from the user
                line = localBufferIn.readLine();
                // Check for termination sequence
                done = line.equals(".");
                // Send line to server
                networkPrinterOut.println(line);
                // Print response from server
                if (!done)
                    System.out.println("Server: " + networkBufferIn.readLine());
            } while (!done);
        } catch (IOException ex) {
            System.out.println(ex);
        } finally {
            localBufferIn.close();
            networkPrinterOut.close();
            networkBufferIn.close();
        }
    }
}




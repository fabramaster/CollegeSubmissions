import java.io.*;
import java.net.*;

public class QuoteClient1 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java QuoteClient1 <hostname>");
            return;
        }

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of quotes to receive: ");
        String numQuotesStr = userInput.readLine();

        // get a datagram socket
        DatagramSocket dsocket = new DatagramSocket();

        try {
            // send request
            byte[] buf = numQuotesStr.getBytes();
            InetAddress address = InetAddress.getByName(args[0]);
            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
            dsocket.send(packet);

            // get responses
            buf = new byte[256];
            int numQuotes = Integer.parseInt(numQuotesStr);
            
            for (int i = 0; i < numQuotes; i++) {
                packet = new DatagramPacket(buf, buf.length);
                dsocket.receive(packet);
                String received = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Quote " + (i + 1) + ": " + received);
            }
        } catch (NumberFormatException e) {
            System.err.println("Please enter a valid number");
        } finally {
            dsocket.close();
        }
    }
}
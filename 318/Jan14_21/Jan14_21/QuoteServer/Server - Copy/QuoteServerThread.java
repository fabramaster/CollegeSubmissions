import java.io.*;
import java.net.*;
import java.util.*;

public class DateQuoteServerThread extends Thread {
    protected DatagramSocket socket = null;
    protected BufferedReader quoteReader = null;
    protected boolean running = true;

    public DateQuoteServerThread() throws IOException {
        socket = new DatagramSocket(4445);
        try {
            quoteReader = new BufferedReader(new FileReader("one-liners.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Could not open quote file: " + e.getMessage());
        }
    }

    public void run() {
        System.out.println("DateQuoteServer is running...");
        
        while (running) {
            try {
                byte[] buf = new byte[256];
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);

                String request = new String(packet.getData(), 0, packet.getLength());
                
                String response;
                if (request.equals("1")) {
                    response = new Date().toString();
                } else {
                    response = getNextQuote();
                }

                buf = response.getBytes();
                InetAddress address = packet.getAddress();
                int port = packet.getPort();
                packet = new DatagramPacket(buf, buf.length, address, port);
                socket.send(packet);
                
            } catch (IOException e) {
                e.printStackTrace();
                running = false;
            }
        }
        socket.close();
    }

    protected String getNextQuote() {
        try {
            // If we've reached the end of the file, start over
            if (!quoteReader.ready()) {
                quoteReader.close();
                quoteReader = new BufferedReader(new FileReader("one-liners.txt"));
            }
            String quote = quoteReader.readLine();
            return (quote != null) ? quote : "No quotes available";
        } catch (IOException e) {
            return "Error reading quote: " + e.getMessage();
        }
    }
}
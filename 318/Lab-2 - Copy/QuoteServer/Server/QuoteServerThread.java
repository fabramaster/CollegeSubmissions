import java.io.*;
import java.net.*;
import java.util.*;

public class QuoteServerThread1 extends Thread {
    protected DatagramSocket dsocket = null;
    protected ArrayList<String> quotes = new ArrayList<>();
    protected Random random = new Random();
    protected boolean running = true;

    public QuoteServerThread1() throws IOException {
        this("QuoteServerThread1");
    }

    public QuoteServerThread1(String name) throws IOException {
        super(name);
        dsocket = new DatagramSocket(4445);

        try {
            BufferedReader in = new BufferedReader(new FileReader("one-liners.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                quotes.add(line);
            }
            in.close();
            System.out.println("Loaded " + quotes.size() + " quotes.");
        } catch (FileNotFoundException e) {
            System.err.println("Could not open quote file.");
            running = false;
        }
    }

    public void run() {
        while (running) {
            try {
                byte[] buf = new byte[256];

                // receive request
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                dsocket.receive(packet);

                // get number of quotes requested
                String request = new String(packet.getData(), 0, packet.getLength()).trim();
                int numQuotes = Integer.parseInt(request);

                // get client info for response
                InetAddress address = packet.getAddress();
                int port = packet.getPort();

                // send requested number of quotes
                for (int i = 0; i < numQuotes; i++) {
                    String quote = getNextQuote();
                    buf = quote.getBytes();
                    packet = new DatagramPacket(buf, buf.length, address, port);
                    dsocket.send(packet);
                    
                    if (i < numQuotes - 1) {
                        Thread.sleep(5000);  // 5 second delay between quotes
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                running = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.err.println("Invalid number format received from client");
            }
        }
        dsocket.close();
    }

    protected String getNextQuote() {
        if (quotes.isEmpty()) {
            return "No quotes available.";
        }
        int index = random.nextInt(quotes.size());
        return quotes.get(index);
    }
}
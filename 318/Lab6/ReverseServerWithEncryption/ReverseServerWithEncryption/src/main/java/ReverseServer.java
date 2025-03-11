import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;


public class ReverseServer
{
    public static final int DEFAULT_PORT = 6868;

    public static void main(String[] args) throws java.io.IOException {
        ServerSocket server = new ServerSocket(DEFAULT_PORT);
        System.out.println("Server listening on port " + DEFAULT_PORT + "\n");

        while (true) {
            try {
            	//waiting for a client connection
                Socket client = server.accept();

                BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream()));
                PrintWriter toClient = new PrintWriter(client.getOutputStream(), true);

                System.out.println("New connection:");
                InetAddress ipAddr = client.getInetAddress();
                System.out.print(ipAddr.getHostAddress() + "/" + ipAddr.getHostName() + " : ");
                System.out.println(client.getPort());

                String line;
                StringBuilder sb;
                String reversed;

                while (!(line = fromClient.readLine()).equals(".")) {
                    System.out.println("From client: " + line);
                    reversed = new StringBuilder (line).reverse().toString();
                    toClient.println(reversed);
                    System.out.println("To client: " + reversed + "\n");
                }
                System.out.println("Connection terminated!\n");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}




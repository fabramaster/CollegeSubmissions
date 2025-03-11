import java.net.*;
import java.io.*;

public class DateServer
{
    public static final int PORT = 6013;

    public static void main(String[] args) throws java.io.IOException {
        Socket client = null;
        ServerSocket sock = null;
        PrintWriter toClient = null;

        try {
            sock = new ServerSocket(PORT);

            while (true) {
                client = sock.accept();

                toClient = new PrintWriter(client.getOutputStream(), true);
                java.util.Date theDate = new java.util.Date();
                toClient.println(theDate.toString());

                toClient.close();
            }
        } catch (java.io.IOException ioe) {
            System.err.println(ioe);
        }
        finally {
            if (toClient != null)
                toClient.close();
            if (client != null)
                client.close();
            if (sock != null)
                sock.close();
        }
    }
}
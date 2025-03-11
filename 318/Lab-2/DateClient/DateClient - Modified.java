import java.net.*;
import java.io.*;

public class DateClient
{
    public static final int PORT = 6013;
    public static final String host = "localhost";

    public static void main(String[] args) throws java.io.IOException {
        BufferedInputStream fromServer = null;
        Socket server = null;

        try {
            server = new Socket(host, PORT);

            fromServer = new BufferedInputStream(server.getInputStream());
            byte[] buffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = fromServer.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }

            fromServer.close();
        } catch (java.io.IOException ioe) {
            System.err.println(ioe);
        }
        finally {
            if (fromServer != null)
                fromServer.close();
            if (server != null)
                server.close();
        }
    }
}
import java.net.*;
import java.io.*;

public class Connection1 implements Runnable
{
    public static final int BUFFER_SIZE = 256;
    private Socket client;

    public Connection1(Socket client) {
        this.client = client;
    }

    public void run() {
        byte[] buffer = new byte[BUFFER_SIZE];
        String line;
        InputStream fromClient = null;
        OutputStream toClient = null;

        try {
            fromClient = new BufferedInputStream(client.getInputStream());
            toClient = new BufferedOutputStream(client.getOutputStream());
            int numBytes;

            while ((numBytes = fromClient.read(buffer)) > 0) {
                toClient.write(buffer, 0, numBytes);
                toClient.flush();
            }
        }
        catch (IOException ioe) {
            System.err.println(ioe);
        }
        finally {
            try {
                if (fromClient != null)
                    fromClient.close();
                if (toClient != null)
                    toClient.close();
                if (client != null)
                    client.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
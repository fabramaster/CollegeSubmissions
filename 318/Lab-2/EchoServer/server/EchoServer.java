import java.net.*;
import java.io.*;

public class EchoServer1
{
    public static final int DEFAULT_PORT = 6007;

    public static void main(String[] args) throws IOException {
        ServerSocket sock = null;

        try {
            sock = new ServerSocket(DEFAULT_PORT);

            while (true) {
                Thread worker = new Thread(new Connection1(sock.accept()));
                worker.start();
            }
        }
        catch (IOException ioe) { }
        finally {
            if (sock != null)
                sock.close();
        }
    }
}
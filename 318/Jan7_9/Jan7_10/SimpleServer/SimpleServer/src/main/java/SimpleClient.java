import java.net.*;

public class SimpleClient {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("usage: java SimpleClient <host>");
            System.exit(0);
        }

        // Create socket connection to server
        Socket sock = new Socket(args[0], 2500);
        
        System.out.print(InetAddress.getLocalHost() + " : ");
        System.out.println(sock.getLocalPort());
        
        InetAddress ipAddr = sock.getInetAddress();
        System.out.print(ipAddr.getHostAddress() + "/" + ipAddr.getHostName() + " : ");
        System.out.println(sock.getPort());
        
        sock.close();
    }
}
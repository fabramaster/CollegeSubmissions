
import java.net.*;
import java.io.*;


public class LowPortScanner {

  public static void main(String[] args) {

    String host = "localhost";

    if (args.length > 0) {
      host = args[0];
    }
    try {
      InetAddress theAddress = InetAddress.getByName(host);
      for (int i = 1; i < 1024; i++) {
        Socket connection = null;
        try {
          connection = new Socket(host, i);
          System.out.println("There is a server on port "
           + i + " of " + host);
        }
        catch (IOException e) {
          // must not be a server on this port
        }
        finally {
          try {
            if (connection != null) connection.close();
          }
          catch (IOException e) {}
        }
      } // end for
    } // end try
    catch (UnknownHostException e) {
      System.err.println(e);
    }

  }  // end main


}  // end PortScanner

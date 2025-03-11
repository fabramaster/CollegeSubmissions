
import java.net.*;
import java.io.*;


public class RandomPort {

  public static void main(String[] args) {

    try {
      ServerSocket ss = new ServerSocket(0);
      System.out.println("This server runs on port " + ss.getLocalPort());
    }
    catch (IOException e) {
      System.err.println(e);
    }

  }

}

import java.io.*;

public class QuoteServer1 {
    public static void main(String[] args) throws IOException {
        new QuoteServerThread1().start();
    }
}
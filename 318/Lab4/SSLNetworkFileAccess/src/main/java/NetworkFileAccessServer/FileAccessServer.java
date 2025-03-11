package NetworkFileAccessServer;

import javax.net.ssl.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.security.*;

public class FileAccessServer extends JFrame {
   private ObjectInputStream input;
   private JTextArea serverDisplay;
   private JButton clearButton, exitButton;
   private SSLSocket client;

   // Constructor -- initialize the Frame
   public FileAccessServer() {
      super("FileAccessServer");

      // create instance of reusable user interface
      serverDisplay = new JTextArea();
      clearButton = new JButton("Clear");
      clearButton.addActionListener(
         // anonymous inner class to handle openButton event
         new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               serverDisplay.setText("");
            }
         }
      );

      exitButton = new JButton("Exit");
      exitButton.addActionListener(
         // anonymous inner class to handle openButton event
         new ActionListener() {
            public void actionPerformed(ActionEvent event) {
               dispose();
               System.exit(0);
            }
         }
      );

      getContentPane().add(new JScrollPane(serverDisplay), BorderLayout.CENTER);
      getContentPane().add(clearButton, BorderLayout.NORTH);
      getContentPane().add(exitButton, BorderLayout.SOUTH);

      setBounds(900, 0, 300, 200);
      setVisible(true);

      SSLServerSocket sock = null;

      try {
         String keystoreFile = "FileAccessKeys";
         String keystorePass = "gogogo";

         System.setProperty("javax.net.ssl.keyStore", keystoreFile);
         System.setProperty("javax.net.ssl.keyStorePassword", keystorePass);

         SSLServerSocketFactory factory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();

         sock = (SSLServerSocket) factory.createServerSocket(6868);

         while (true) {
            client = (SSLSocket) sock.accept();
            InetAddress ipAddr = client.getInetAddress();
            serverDisplay.append("Secure connection from -> " + 
               ipAddr.getHostAddress() + ":" + client.getPort() + "\n");
            Thread worker = new Thread(new Connection(client));
            worker.start();
         }
      }
      catch (IOException ioe) {
         serverDisplay.append("Error: " + ioe.getMessage() + "\n");
      }
      finally {
         try {
            if (sock != null) sock.close();
         }
         catch (IOException e) {}
      }
   }

   public static void main(String args[]) {
      FileAccessServer app = new FileAccessServer();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
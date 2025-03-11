package NetworkFileAccessServer;

// FileAccessServer.java
// This program reads a file of objects sequentially
// and displays each record.
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class FileAccessServer extends JFrame {
   private ObjectInputStream input;
   private JTextArea serverDisplay;
   private JButton clearButton, exitButton;
   private Socket client;


   // Constructor -- initialize the Frame
   public FileAccessServer()
   {
      super( "FileAccessServer" );

      // create instance of reusable user interface
      serverDisplay = new JTextArea();
      clearButton = new JButton ("Clear");
      clearButton.addActionListener (

         // anonymous inner class to handle openButton event
         new ActionListener() {

            // call openFile when button pressed
            public void actionPerformed( ActionEvent event )
            {    serverDisplay.setText("");
            }
         }
      );

      exitButton = new JButton("Exit");
      exitButton.addActionListener (

         // anonymous inner class to handle openButton event
         new ActionListener() {

            // call openFile when button pressed
            public void actionPerformed( ActionEvent event )
            {    dispose();
                 System.exit(0);
            }
         }
      );

      getContentPane().add( new JScrollPane (serverDisplay), BorderLayout.CENTER );
      getContentPane().add( clearButton, BorderLayout.NORTH );
      getContentPane().add( exitButton, BorderLayout.SOUTH);

      setBounds(900,0, 300, 200 );
      setVisible( true );

   	  ServerSocket sock = null;

		try {
			// establish the socket
			sock = new ServerSocket(6868);

			while (true) {
				/**
				 * now listen for connections
				 * and service the connection in a separate thread.
				 */
				client = sock.accept();
				InetAddress ipAddr = client.getInetAddress();
				serverDisplay.append("Connected from -> " + ipAddr.getHostAddress() +
				                     ":" + client.getPort() + "\n");
				Thread worker = new Thread(new Connection(client));
				worker.start();
			}

		}
		catch (IOException ioe) { }
		finally {
		       try{
		            sock.close();
		          }
		       catch (IOException e) {};
    	}


   } // end FileAccessServer constructor
   public static void main( String args[] )
   {
      FileAccessServer app = new FileAccessServer();
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

} // end class ReadSequentialFile
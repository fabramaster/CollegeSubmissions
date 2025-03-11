package TimeOutTimer;

import java.net.*;
import java.io.*;

/**
  * SimpleClient connects to TCP port 2000, writes a line
  * of text, and then reads the echoed text back from the server.
  * This client will detect network timeouts, and exit gracefully,
  * rather than stalling.
  * Start server, and the run by typing
  *
  *   java SimpleClient
  */

public class SimpleClient
{
	/** Connects to a server on port 2000,
	    and handles network timeouts gracefully
	  */
	public static void main (String args[]) throws Exception
	{
		System.out.println ("Starting timer.");
		// Start timer
		NetTimer timer = new NetTimer(3000);
		timer.start();

	    try{	// Connect to remote host
		    Socket socket = new Socket ("localhost", 2000);
		    System.out.println ("Connected to localhost:2000");

		// Reset timer - timeout can occur on connect
		//timer.reset();

		// Create a print stream for writing
		PrintWriter pout = new PrintWriter(
			socket.getOutputStream(),true );

		// Create a data input stream for reading
		BufferedReader din = new BufferedReader ( new InputStreamReader(
			socket.getInputStream() ));


	          timer.reset();

//Try this for testing Socket option with EchoServer
// int a =0;
// for (int i = 1; i<= 300000000; i++) {a = a + 1;};

		// Print hello msg
		pout.println ("Hello world!");
		System.out.println ("Message sent to the server: Hello world!");

		// Reset timer - timeout is likely to occur during the read
		timer.reset();

		// Print msg from server
		System.out.println ("Message received from the server: " + din.readLine());

		// Shutdown timer
		timer.stop();

		// Close connection
		socket.close();
	   } catch (ConnectException e) {
	   	 System.err.println("Connection is refused! The host server may not be up and running");
	   	 }
	}
}

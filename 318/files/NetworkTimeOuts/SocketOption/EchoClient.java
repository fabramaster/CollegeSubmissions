import java.net.*;
import java.io.*;

/**
  *
  *   java EchoClient
  */
public class EchoClient
{
	/** Connects to a server on port 2000,
	    and handles network timeouts gracefully
	  */


	public static void main (String args[]) throws Exception
	{
     	final int timeout_length = 2000 ;

	    try{	// Connect to remote host
		    Socket socket = new Socket ("localhost", 2000);
		    System.out.println ("Connected to localhost:2000");


		// Create a print stream for writing
		PrintWriter pout = new PrintWriter(
			socket.getOutputStream(),true );

		// Create a data input stream for reading
		BufferedReader din = new BufferedReader ( new InputStreamReader(
			socket.getInputStream() ));

				// Set a timeout of 'timeout_length' milliseconds
		try
		{
			socket.setSoTimeout (timeout_length);
		}
		catch (SocketException se)
		{
			System.err.println ("Unable to set socket option SO_TIMEOUT");
		}

		// Print hello msg
		pout.println ("Hello world!");
		System.out.println ("Message sent to the server: Hello world!");


			try
			{
				// Print msg from server
				System.out.println ("Message received from the server: " + din.readLine());
			}
			catch (InterruptedIOException iioe)
			{
				System.out.println ("Timeout occurred - killing connection");

			}

		socket.close();

	   } catch (ConnectException e) {
	   	 System.err.println("Connection is refused! The host server may not be up and running");
	   	 }
	}
}

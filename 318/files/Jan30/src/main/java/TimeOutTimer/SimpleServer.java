package TimeOutTimer;

import java.net.*;
import java.io.*;
/**
  * SimpleServer binds to TCP port 2000, reads a line
  * of text, and then echoes it back to the user. To
  * demonstrate a network timeout, every second connection
  * will stall for twenty seconds.
  */

public class SimpleServer extends Thread
{   // Shall we stall? flag
	protected static boolean shallWeStall = true;

	// Socket connection
	private Socket m_connection;

	/**
	  * Constructor, accepting a socket connection
	  *	@param	connection	Connection to process
	  */
	public SimpleServer (Socket connection)
	{   // Assign to member variable
		m_connection = connection;
	}

	// Starts a simple server on port 2000
	public static void main (String args[]) throws Exception
	{	ServerSocket server = new ServerSocket (2000);
		for (;;)
		{   // Accept an incoming connection
			Socket connection = server.accept();
			// Process in another thread
			new SimpleServer(connection).start();
		}
	}

	// Performs connection handling
	public void run()
	{   System.out.println("\nServer's thread starts running: ");
		try
		{   BufferedReader din = new BufferedReader( new InputStreamReader (m_connection.getInputStream() ));
			PrintWriter pout = new PrintWriter (m_connection.getOutputStream(), true );

			// Read line from client
			String data = din.readLine();
			System.out.println("Message read from the client: "+ data);
			// Check to see if we should simulate a stalled server
			if (shallWeStall)
			{   // Yes .. so reset flag and stall
				shallWeStall = false;
				try
				{   Thread.sleep (20000);
					System.out.print("After 20 seconds of waiting -> ");
				} catch (InterruptedException ie ) {}
			}
			else
			{	// No.... but we will next time
				shallWeStall = true;
			}

			// Echo data back to clinet
			pout.println (data);
			System.out.println ("Message sent back to the client: " + data);

			// Close connection
			m_connection.close();
		}
		catch (IOException ioe)
		{	System.err.println ("I/O error");  }
	}
}



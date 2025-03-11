import java.net.*;
import java.io.*;

public class DateServer
{
	// the default port
	public static final int PORT = 6013;

	public static void main(String[] args) throws java.io.IOException {
		Socket client = null;
		ServerSocket sock = null;
		byte [] bbuffer = new byte [1024];
		String line;
		int numbytes = 0;
		DataOutputStream toClient = null;


		try {
		// create a server socket and bind it to default port
		sock = new ServerSocket(PORT);

		while (true) {
			// await client connections
			client = sock.accept();

			// obtain the output stream and deliver the date
			toClient = new DataOutputStream(client.getOutputStream());
			java.util.Date theDate = new java.util.Date();
			toClient.writeBytes(theDate.toString() + "\n");

			// closing the output stream closes the socket as well
			toClient.close();
		}
		} catch (java.io.IOException ioe) {
			System.err.println(ioe);
		}
		finally {
			// let's close streams and sockets
			if (toClient!= null)
				toClient.close();
			if (client != null)
				client.close();
			if (sock != null)
				sock.close();
		}
	}
}

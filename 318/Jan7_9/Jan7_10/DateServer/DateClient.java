import java.net.*;
import java.io.*;

public class DateClient
{
	// the default port
	public static final int PORT = 6013;
	// this could be replaced with an IP address or IP name
	public static final String host = "localhost";

	public static void main(String[] args) throws java.io.IOException {
		BufferedReader fromServer = null;
		Socket server = null;

		try {
			// create socket and connect to default port
			server = new Socket(host, PORT);

			// read the date and close the socket
			fromServer = new BufferedReader(new InputStreamReader(server.getInputStream()));
			String line;
			while ( (line = fromServer.readLine()) != null)
				System.out.print(line);

			// closing the input stream closes the socket as well
			fromServer.close();
		} catch (java.io.IOException ioe) {
			System.err.println(ioe);
		}
		finally {
			// let's close streams and sockets
			if (fromServer!= null)
				fromServer.close();
			if (server != null)
				server.close();
		}
	}
}

/**
 * Handler class containing the logic for echoing results back
 * to the client.
*/

import java.io.*;
import java.net.*;
import java.util.*;

public class Handler
{
        public static final int BUFFER_SIZE = 256;
		private	BufferedReader in = null;

	/**
	 * this method is invoked by a separate thread
	 */
	public void process(Socket client) throws IOException {
		byte[] buffer = new byte[BUFFER_SIZE];
		String message, quote;
		InputStream fromClient = null;
		PrintWriter toClient = null;


        try {
            in = new BufferedReader(new FileReader("one-liners.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Could not open quote file. Serving time instead.");
        }

		try {
			/**
			 * get the input and output streams associated with the socket.
			 */
			fromClient = new BufferedInputStream(client.getInputStream());
			toClient = new PrintWriter (client.getOutputStream(), true);
			int numBytes;
			boolean done = false;

            /** continually loop until the client closes the connection */
			while ( !done && (numBytes = fromClient.read(buffer)) > 0) {
                   message = (new String(buffer)).trim();
                   if (message.equalsIgnoreCase("quote")){
                   	  if (in == null)
                    	 quote = new Date().toString();
                		else
                   	 	quote = getNextQuote ();

                   	 	toClient.println(quote);
                   }
                   else
                   	done = true;

			}

        }
		catch (IOException ioe) {
			System.err.println(ioe);
		}
        finally {
                    // close streams and socket
                    if (fromClient != null)
                        fromClient.close();
                    if (toClient != null)
                        toClient.close();
                    if (client != null)
                        client.close();
                }
	}

	private String getNextQuote() {
        String returnValue = null;
        try {
            if ((returnValue = in.readLine()) == null) {
                in.close();
                returnValue = "No more quotes. Goodbye.";
            }
        } catch (IOException e) {
            returnValue = "IOException occurred in server.";
        }
        return returnValue;
    }
}

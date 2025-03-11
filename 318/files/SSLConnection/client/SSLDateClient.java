import java.io.*;
import javax.net.ssl.*;

public class SSLDateClient
{
//This SSL client connection is good for using Java 11? or below without using TrustManager
	// the default port
	public static final int portNumber = 8888;
	// this could be replaced with an IP address or IP name
	public static final String host = "localhost";

	public static void main(String[] args) throws java.io.IOException {
		BufferedReader fromServer = null;
		SSLSocket client = null;
                
                
                //The certificate is accepted by this client program.
                System.setProperty("javax.net.ssl.trustStore", "trustedcerts");

	
            try{
      		SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
                
      		client = (SSLSocket) factory.createSocket(host, portNumber);
        // Since the certificate from the server already imported manually into "trustedcerts" keystore,
        // that signals the client already accepted the certificate. So a SSL connection should be established.

		// read the date and close the socket
		fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
		String line;
		while ( (line = fromServer.readLine()) != null)
				System.out.print(line);

		// closing the input stream closes the socket as well
		fromServer.close();
	  } catch (Exception ioe) {
			System.err.println(ioe);
  		}
	    finally {
		// let's close streams and sockets
		if (fromServer!= null)
			fromServer.close();
		if (client != null)
			client.close();
		}
	}
}

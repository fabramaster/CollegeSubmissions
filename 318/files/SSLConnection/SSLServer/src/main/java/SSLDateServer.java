import java.net.*;
import javax.net.*;
import java.io.*;
import javax.net.ssl.*;
import java.security.*;

public class SSLDateServer
{
	//  the default port
	public static final int portNumber = 8888;

	public static void main(String[] args) throws java.io.IOException {
		boolean startagain = true;
		byte [] bbuffer = new byte [1024];
		String line;
		int numbytes = 0;
		DataOutputStream toClient = null;
		SSLSocket client = null;

//using older version of Java Keystores (e.g Java 8? or below): 
//using the pre-defined passwords from "serverkeys" keystore, created by Java 8 keytool utility

   String keystore = "serverkeys";
   char keystorepass[] = "letmein".toCharArray();  // the passwords is required to generate a certificate
                                                  // to the client for acceptance
 

//support Java keystore (e.g. Java 9? or higher version, 
//Java client needs to use trust manager to accept the SSL certificate for https connection.

/*
   String keystore = "cosc318keys";  // created by Java 22 "keytool" utility
   char keystorepass[] = "bigdeal".toCharArray();  // the password is required to generate a certificate
 */                                                 // to the client for acceptance


   SSLServerSocket server = null;
   while (true) {
   try {
   	  //Set up SSL environment from the Keystore for a SSLServerSocket
   	  KeyStore ks = KeyStore.getInstance("PKCS12");
      ks.load(new FileInputStream(keystore), keystorepass);
      KeyManagerFactory kmf =
        KeyManagerFactory.getInstance("SunX509");
      kmf.init(ks, keystorepass);
      SSLContext sslcontext = SSLContext.getInstance("SSLv3");
      sslcontext.init(kmf.getKeyManagers(), null, null);
      ServerSocketFactory ssf = sslcontext.getServerSocketFactory();
      server = (SSLServerSocket) ssf.createServerSocket(portNumber);

		while (true) {
			System.out.println("Server is waiting for a new connection....");
			//waiting to accept a SSL connection request from a client
			client = (SSLSocket) server.accept();

			// obtain the output stream and deliver the date
			toClient = new DataOutputStream(client.getOutputStream());
			java.util.Date theDate = new java.util.Date();
			toClient.writeBytes(theDate.toString() + "\n");

			// closing the output stream closes the socket as well
			toClient.close();
		}
	} catch (java.io.IOException ioe) {
			System.err.println(ioe);}
	  catch (Exception e) {
			System.err.println(e);}
	  finally {
			// let's close streams and sockets
			if (toClient!= null)
				toClient.close();
			if (client != null)
				client.close();
			if (server != null)
				server.close();
		}
	}
  }
}

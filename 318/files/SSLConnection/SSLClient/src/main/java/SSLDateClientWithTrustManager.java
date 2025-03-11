/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.*;
import javax.net.ssl.*;

import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class SSLDateClientWithTrustManager {
	// the default port
	public static final int portNumber = 8888;
	// this could be replaced with an IP address or IP name
	public static final String host = "localhost";

	public static void main(String[] args) throws java.io.IOException {
		BufferedReader fromServer = null;
		SSLSocket client = null;
                
                try {
            // Create trust manager that trusts all certificates
            TrustManager[] trustManagers = new TrustManager[]{
                new X509TrustManager() {
                    @Override
                    public void checkClientTrusted(X509Certificate[] x509Certificates, String s)
                      throws CertificateException {
                    }

                    @Override
                    public void checkServerTrusted(X509Certificate[] x509Certificates, String s)
                      throws CertificateException {
                    }

                    @Override
                    public X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[0];
                    }
                }
            };

            // Create SSL context
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustManagers, new SecureRandom());
            //trustManagers will accept all certificates by default 
            
            
            // Create SSL socket factory
            SSLSocketFactory factory = sslContext.getSocketFactory();
            client = (SSLSocket) factory.createSocket(host, portNumber);
        

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

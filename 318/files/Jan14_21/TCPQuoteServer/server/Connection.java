/**
 * This is the separate thread that services each
 * incoming echo client request.
 */

import java.net.*;
import java.io.*;

public class Connection implements Runnable
{
	public Connection(Socket client) {
		this.client = client;
	}

	public void run() {
		try {
		handler.process(client);
        }
        catch (IOException e) {
        	e.printStackTrace();
    }
	}

	private Socket	client;
	private Handler handler = new Handler();
}


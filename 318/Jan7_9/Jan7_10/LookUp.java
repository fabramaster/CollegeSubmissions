import java.io.*;
import java.net.*;


public class LookUp
{
	/**
	 * @param host may be either an IP name or IP address
	 */
	private static void seek(String host) {
		try {
			InetAddress[] hosts = InetAddress.getAllByName(host);

			if (Character.isDigit(host.charAt(0)))
				for (int i = 0; i < hosts.length; i++)
					System.out.println("\t"+hosts[i].getHostName());
			else
				for (int i = 0; i < hosts.length; i++)
                      System.out.println("\t"+hosts[i].getHostAddress());
		}
		catch (UnknownHostException unhe) {
			System.err.println("\tUnknown Host: " + host);
		}
	}

	public static void main(String[] args) throws java.io.IOException {
		// read from the command line - enter "." to quit.
		BufferedReader cl = new BufferedReader(new InputStreamReader(System.in));

		String host;
		while ( !(host = cl.readLine()).equals(".")) {
			if (host != null)
				seek(host);
		}
	}
}

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class SimpleServer
{
	public static void main(String[] args) throws java.io.IOException {
		ServerSocket server = new ServerSocket(2501);

		while (true) {
			//wait for client connection
			Socket client = server.accept();

			// get the server-side info
			System.out.print(InetAddress.getLocalHost() + " : ");
			System.out.println(server.getLocalPort());

			// get the client-side info
			InetAddress ipAddr = client.getInetAddress();
			System.out.print(ipAddr.getHostAddress() + "/" + ipAddr.getHostName() + " : ");
			System.out.println(client.getPort());

			// close the socket
			client.close();
		}
	}
}




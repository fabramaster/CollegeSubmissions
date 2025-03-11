/**
 *
 * @author dling
 */
import java.rmi.Naming;
import java.rmi.registry.Registry;

public class HelloServer {

        public static void main(String[] args) {
                try {
                        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);//1099 is the port number
              	      	r.rebind("hello", new Hello("You have to odd to be number one!"));
                        System.out.println("Server is connected and ready for operation.");
                } catch (Exception e) {
                        System.out.println("Server not connected: " + e);
                }
        }
}

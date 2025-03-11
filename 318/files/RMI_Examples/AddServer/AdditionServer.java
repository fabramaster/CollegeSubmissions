import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.Registry;


public class AdditionServer {
	   public static void main (String[] argv) {
		   try {
		   	   Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
			   Naming.rebind("Add", new Addition());

			   System.out.println("Addition Server is ready.");
			   }catch (Exception e) {
				   System.out.println("Addition Server failed: " + e);
				}
		   }
}


/**
 *
 * @author dling
 */

import java.rmi.Naming;

public class HelloClient {

        public static void main(String[] argv) {

                try {
                        HelloInterface hello = (HelloInterface) Naming.lookup("rmi://localhost/hello");
                        System.out.println(hello.say());
                } catch (Exception e) {
                        System.out.println("HelloClient exception: " + e);
                }
        }
}

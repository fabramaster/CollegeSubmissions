/* Looks up a Fortune object in the registry.
 * Invokes its getFortune method remotely to
 * get a fortune for now and for later.
 */

import java.rmi.*;


public class FortuneClient {
  public static void main(String[] args) {
  	/*
       //old Security Manager class:
  	  //System.setSecurityManager(new RMISecurityManager());

  	SecurityManager security = System.getSecurityManager();
  	System.setSecurityManager(security);
	*/

    try {
       String url = "rmi://localhost/Seer";
       Fortune fortuneTeller = (Fortune)Naming.lookup(url);
       String fortune = fortuneTeller.getFortune(Fortune.NOW);
       System.out.println("Today's fortune is: " + fortune);
       fortune = fortuneTeller.getFortune(Fortune.LATER);
       System.out.println("Future fortune is: " + fortune);
     }catch(Exception e) {
        e.printStackTrace();
     }
  }
}
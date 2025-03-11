/* Implements the Fortune interface. Establishes a server
 * for remote clients to use a FortuneServer object.
 */


import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class FortuneServer extends UnicastRemoteObject
                                   implements Fortune {
  public static final int SIZE = 3;
  private Vector now = new Vector(SIZE);
  private Vector later = new Vector(SIZE);
  public FortuneServer()throws RemoteException {
    now.addElement("A friend is near");
    now.addElement("Expect a call");
    now.addElement("Someone misses you");
    later.addElement("Wealth awaits -- if you desire it.");
    later.addElement("Climb the hill of effort for high grades.");
    later.addElement("The door to success is open to you.");
  }

  private Vector find(String when) {
    if (when.equals(Fortune.NOW))
       return now;
    else return later;
  }

  public synchronized String getFortune(String when)throws RemoteException {
    int number = (int)(3*Math.random());
    Vector fortunes = find(when);
    return (String)fortunes.elementAt(number);
  }

  public static void main(String[] args) {
      /*
	System.setProperty("java.security.policy", "C:\\policy");

	//Old Security Manager Class:
	//System.setSecurityManager(new RMISecurityManager());

  	SecurityManager security = System.getSecurityManager();
  	System.setSecurityManager(security);
    */

    try {
       Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
       Fortune fortune = new FortuneServer();
       String url = "Seer";
       Naming.rebind(url,fortune);
       System.out.println("Starting Fortune server");
     }catch(Exception e) {
        e.printStackTrace();
     }
  }
}
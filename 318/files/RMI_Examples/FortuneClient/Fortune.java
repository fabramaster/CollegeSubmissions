/* The server implements this interface and clients call
 * its method remotely.
 */


import java.rmi.*;

public interface Fortune extends Remote {
  public static final String NOW = "Now";
  public static final String LATER = "Later";
  public String getFortune(String when)throws RemoteException;
}
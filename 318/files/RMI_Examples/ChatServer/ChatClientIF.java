import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChatClientIF extends Remote{

	public void messageFromServer(String message) throws RemoteException;

	public void updateUserList(String[] currentUsers) throws RemoteException;

}

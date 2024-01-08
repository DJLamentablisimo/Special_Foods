package special_foods.server.data.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemoteFacade extends Remote {
	void downloadInformation() throws RemoteException;
	void downloadFromFC() throws RemoteException;
	void downloadFromAPP() throws RemoteException;
	void searchProduct() throws RemoteException;
}

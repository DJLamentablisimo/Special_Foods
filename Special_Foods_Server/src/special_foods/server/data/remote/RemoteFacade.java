package special_foods.server.data.remote;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import special_foods.server.data.domain.Product;
import special_foods.server.data.services.AppService;

public class RemoteFacade extends UnicastRemoteObject implements IRemoteFacade, Serializable {	
	private static final long serialVersionUID = 1L;
	
	//TODO: Remove this instances when Singleton Pattern is implemented
	private AppService appService = new AppService();

	public RemoteFacade() throws RemoteException {
		super();		
	}

	@Override
	public void downloadInformation() throws RemoteException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void downloadFromFC() throws RemoteException{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void downloadFromAPP() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProduct() throws RemoteException {
		List<Product> products = appService.getProducts();
		for (Product p : products) {
			System.out.println(p.toString());
		}
	}
	
	public void purchaseProduct() throws RemoteException {
		
	}
}
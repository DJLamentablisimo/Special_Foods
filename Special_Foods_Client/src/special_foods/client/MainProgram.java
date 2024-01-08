package special_foods.client;

import java.rmi.RemoteException;

import special_foods.client.remote.ServiceLocator;

public class MainProgram {
	public static void main(String[] args) {	
		ServiceLocator serviceLocator = new ServiceLocator();
		
		//args[0] = RMIRegistry IP
		//args[1] = RMIRegistry Port
		//args[2] = Service Name
		serviceLocator.setService(args[0], args[1], args[2]);
		
		//LoginController loginController = new LoginController(serviceLocator);
		try {
			serviceLocator.getService().searchProduct();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

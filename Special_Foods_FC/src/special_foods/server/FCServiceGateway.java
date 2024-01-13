package special_foods.server;

import java.rmi.Naming;

import es.deusto.ingenieria.sd.auctions.currency.remote.IGoogleService;

public class FCServiceGateway{
	
	private static FCServiceGateway instance;
	private IFCService FCService; //NO SE QUE ES ESTO
	
	private List<Product> products = new ArrayList<Product>();

	products.add(new Product("Zanahoria", "Hortaliza naranja y alargada", "Eustaquio Habichuela", "", 10, 2));
	products.add(new Product("Zanahoria Dorada", "Hortaliza dorada y alargada", "Eustaquio Habichuela", "", 10, 2));

	
	private FCServiceGateway() {
		try {
			String URL = "//127.0.0.1:1099/FC";
			this.FCService = (IFCService) Naming.lookup(URL); 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static FCServiceGateway getInstance() {
		if(instance == null) {
			instance = new FCServiceGateway();
		}
		return instance;
	}
	
	public boolean downloadInfo() {
		
		
	}
}
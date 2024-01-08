package special_foods.server.data.services;
import java.util.ArrayList;
import java.util.List;

import special_foods.server.data.domain.*;

public class AppService {
	private List<Product> products = new ArrayList<Product>();

	public AppService() {
		this.initializeData();
	}
	
	private void initializeData() {
		//Create products
		products.add(new Product("Zanahoria", "Hortaliza naranja y alargada", "Eustaquio Habichuela", "", 10, 2));
		products.add(new Product("Zanahoria Dorada", "Hortaliza dorada y alargada", "Eustaquio Habichuela", "", 10, 2));
	}
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}

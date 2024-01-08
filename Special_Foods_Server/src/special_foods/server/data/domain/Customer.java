package special_foods.server.data.domain;

import java.util.List;

public class Customer {
	private String name;
	private List<Product> purchasedProducts;
	
	public Customer(String name, List<Product> purchasedProducts) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getPurchasedProducts() {
		return purchasedProducts;
	}

	public void setPurchasedProducts(List<Product> purchasedProducts) {
		this.purchasedProducts = purchasedProducts;
	}
	
	
}

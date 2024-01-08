package special_foods.server.data.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CustomerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String name;
	private List<ProductDTO> products = new ArrayList<>();


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public List<ProductDTO> getProducts() {
		return products;
	}


	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		result.append(this.name);
		
		return result.toString();
		
	}
}

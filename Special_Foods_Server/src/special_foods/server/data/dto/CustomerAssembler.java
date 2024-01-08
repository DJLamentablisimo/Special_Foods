package special_foods.server.data.dto;

import java.util.ArrayList;
import java.util.List;

import special_foods.server.data.domain.Customer;

public class CustomerAssembler {
	private static CustomerAssembler instance;
	
	private CustomerAssembler() { }
	
	public static CustomerAssembler getInstance() {
		if (instance == null) {
			instance = new CustomerAssembler();
		}
		
		return instance;
	}
	
	public CustomerDTO customerToDTO(Customer customer) {
		CustomerDTO dto = new CustomerDTO();
		
		dto.setName(customer.getName());
		dto.setProducts(ProductAssembler.getInstance().productToDTO(customer.getPurchasedProducts()));
		
		return dto;
	}
	
	public List<CustomerDTO> customerToDTO(List<Customer> customers) {
		List<CustomerDTO> dtos = new ArrayList<>();
		
		for (Customer customer : customers) {
			dtos.add(this.customerToDTO(customer));
		}
		
		return dtos;
	}
}

package special_foods.server.data.dto;

import java.util.ArrayList;
import java.util.List;

import special_foods.server.data.domain.Product;

public class ProductAssembler {
	private static ProductAssembler instance;
	
	private ProductAssembler() { }
	
	public static ProductAssembler getInstance() {
		if (instance == null) {
			instance = new ProductAssembler();
		}
		
		return instance;
	}
	
	public ProductDTO productToDTO(Product product) {
		ProductDTO dto = new ProductDTO();
		
		dto.setName(product.getName());
		dto.setDescription(product.getDescription());
		dto.setOrigin(product.getOrigin());
		dto.setPrice(product.getPrice());
		dto.setAmount(product.getAmount());
		dto.setProducer(product.getProducer());
		
		return dto;
	}
	
	public List<ProductDTO> productToDTO(List<Product> products) {
		List<ProductDTO> dtos = new ArrayList<>();
		
		for (Product product : products) {
			dtos.add(this.productToDTO(product));
		}
		
		return dtos;
	}
	
	
	
}

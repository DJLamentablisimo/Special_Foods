package special_foods.server.data.dto;

import java.util.ArrayList;
import java.util.List;

import special_foods.server.data.domain.Farmer;

public class FarmerAssembler {
	private static FarmerAssembler instance;
	
	private FarmerAssembler() { }
	
	public static FarmerAssembler getInstance() {
		if (instance == null) {
			instance = new FarmerAssembler();
		}
		
		return instance;
	}
	
	public FarmerDTO farmerToDTO(Farmer farmer) {
		FarmerDTO dto = new FarmerDTO();
		
		dto.setName(farmer.getName());
		
		return dto;
	}
	
	public List<FarmerDTO> productToDTO(List<Farmer> farmers) {
		List<FarmerDTO> dtos = new ArrayList<>();
		
		for (Farmer farmer : farmers) {
			dtos.add(this.farmerToDTO(farmer));
		}
		
		return dtos;
	}
}

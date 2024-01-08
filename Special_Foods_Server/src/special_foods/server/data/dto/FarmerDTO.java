package special_foods.server.data.dto;

import java.io.Serializable;

public class FarmerDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		result.append(this.name);
		
		return result.toString();
		
	}
	
}

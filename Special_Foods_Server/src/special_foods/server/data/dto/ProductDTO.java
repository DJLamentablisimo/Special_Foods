package special_foods.server.data.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private String producer;
    private String origin;
    private int amount;
    private double price;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		result.append(this.name);
		result.append(" - ");
		result.append(this.description);
		result.append(" - ");
		result.append(this.producer);
		result.append(" - ");
		result.append(this.origin);
		result.append(" - ");
		result.append(this.price);
		result.append("€ ");
		
		return result.toString();
		
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

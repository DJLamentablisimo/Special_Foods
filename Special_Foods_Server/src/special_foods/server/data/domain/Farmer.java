package special_foods.server.data.domain;

public class Farmer {
	private String name;
	
	public Farmer(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

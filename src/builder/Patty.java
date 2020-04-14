package builder;

public class Patty implements Ingredient {
	
	private String name;
	
	public Patty() {
		this.name = "Patty";
	}

	@Override
	public Ingredient getIngredient() {
		return this;
	}
	
	@Override
	public String toString() {
		return this.name;
		
	}

}

package builder;

public class Cheese implements Ingredient {
	
	private String name;
	
	public Cheese() {
		this.name = "Cheese";
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

package builder;

public class Bun implements Ingredient {
	
	private String name;
	
	public Bun() {
		this.name = "Bun";
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

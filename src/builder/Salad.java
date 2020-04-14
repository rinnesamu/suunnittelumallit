package builder;

public class Salad implements Ingredient {
	
	private String name;
	
	public Salad() {
		this.name = "Salad";
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

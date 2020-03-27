package decorator;

public abstract class Ingredient implements IPizza {
	protected IPizza pizza;

	public Ingredient (IPizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public double getPrice() {
		return pizza.getPrice();
	}

	@Override
	public String getDescription() {
		return pizza.getDescription();
	}

}

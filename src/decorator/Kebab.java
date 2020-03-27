package decorator;

public class Kebab extends Ingredient {
	
	private double price = 2.20;

	public Kebab(IPizza pizza) {
		super(pizza);
	}

	public double getPrice() {
		return super.getPrice() + this.price;
	}
	
	public String getDescription() {
		return super.getDescription() + ", Kebab";
	}
}

package decorator;

public class Onion extends Ingredient {
	
	private double price = 1.70;

	public Onion(IPizza pizza) {
		super(pizza);
	}
	
	public double getPrice() {
		return super.getPrice() + this.price;
	}
	
	public String getDescription() {
		return super.getDescription() + ", Onion";
	}

}

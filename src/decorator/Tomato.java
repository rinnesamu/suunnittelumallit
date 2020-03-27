package decorator;

public class Tomato extends Ingredient {
	
	private double price = 1.2;

	public Tomato(IPizza pizza) {
		super(pizza);
	}

	
	public double getPrice() {
		return super.getPrice() + this.price;
	}
	
	public String getDescription() {
		return super.getDescription() + ", Tomato";
	}
}


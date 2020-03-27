package decorator;

public class Pineapple extends Ingredient {

	private double price = 1.2;
	public Pineapple(IPizza pizza) {
		super(pizza);
	}
	
	public double getPrice() {
		return super.getPrice() + this.price;
	}
	
	public String getDescription() {
		return super.getDescription() + ", Pineapple";
	}
}

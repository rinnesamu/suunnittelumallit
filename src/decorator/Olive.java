package decorator;

public class Olive extends Ingredient {
	
	private double price = 2.50;

	public Olive(IPizza pizza) {
		super(pizza);
	}
	

	public double getPrice() {
		return super.getPrice() + this.price;
	}
	
	public String getDescription() {
		return super.getDescription() + ", Olive";
	}
}

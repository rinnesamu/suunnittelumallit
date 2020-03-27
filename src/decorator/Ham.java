package decorator;

public class Ham extends Ingredient {
	
	private double price = 1.50;

	
	public Ham(IPizza pizza) {
		super(pizza);
	}
	@Override
	public double getPrice() {
		return super.getPrice() + this.price;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + ", Ham";
	}

}

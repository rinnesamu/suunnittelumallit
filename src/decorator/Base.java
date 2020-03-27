package decorator;

public class Base implements IPizza {
	private double price;
	
	public Base() {
		this.price = 3.50;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public String getDescription() {
		return "Pizza base, Tomato sauce, Cheese";
	}

}

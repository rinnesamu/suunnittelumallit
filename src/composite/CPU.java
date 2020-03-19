package composite;

public class CPU implements IComponent {
	private double price;
	
	public CPU(double price) {
		this.price = price;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void addComponent(IComponent component) {
		throw new RuntimeException
		("Cannot add components for this component");

	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

}

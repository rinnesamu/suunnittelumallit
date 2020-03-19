package composite;

import java.util.ArrayList;
import java.util.List;

public class Motherboard implements IComponent {

	private double price;
	private List<IComponent> components = new ArrayList<IComponent>();
	
	public Motherboard(double price) {
		this.price = price;
	}
	@Override
	public double getPrice() {
		double sum = this.price;
		for (IComponent c : this.components) {
			sum += c.getPrice();
		}
		
		return sum;
	}

	@Override
	public void addComponent(IComponent component) {
		components.add(component);
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

}

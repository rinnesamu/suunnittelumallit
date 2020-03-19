package composite;

public interface IComponent {
	
	public double getPrice();
	public void setPrice(double price);
	public void addComponent(IComponent component);

}

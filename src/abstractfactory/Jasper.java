package abstractfactory;

public class Jasper {
	private IClothesFactory factory;
	private IHat hat;
	private IShirt shirt;
	private IPants pants;
	private IShoes shoes;
	
	public Jasper() {
		
	}
	public Jasper (IClothesFactory factory) {
		this.factory = factory;
		hat = factory.createHat();
		shirt = factory.createShirt();
		pants = factory.createPants();
		shoes = factory.createShoes();
	}
	
	public IClothesFactory getFactory() {
		return factory;
	}
	public void setFactory(IClothesFactory factory) {
		this.factory = factory;
		hat = factory.createHat();
		shirt = factory.createShirt();
		pants = factory.createPants();
		shoes = factory.createShoes();
	}
	
	public void printClothes() {
		hat.print();
		shirt.print();
		pants.print();
		shoes.print();
	}
	
	
}

package abstractfactory;

public class AdidasFactory implements IClothesFactory {

	@Override
	public IHat createHat() {
		return new AdidasHat();
	}

	@Override
	public IShirt createShirt() {
		return new AdidasShirt();
	}

	@Override
	public IPants createPants() {
		return new AdidasPants();
	}

	@Override
	public IShoes createShoes() {
		return new AdidasShoes();
	} 

}

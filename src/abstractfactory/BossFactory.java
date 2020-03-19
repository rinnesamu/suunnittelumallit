package abstractfactory;

public class BossFactory implements IClothesFactory {

	@Override
	public IHat createHat() {
		return new BossHat();
	}

	@Override
	public IShirt createShirt() {
		return new BossShirt();
	}

	@Override
	public IPants createPants() {
		return new BossPants();
	}

	@Override
	public IShoes createShoes() {
		return new BossShoes();
	}

}

package abstractfactory;

public interface IClothesFactory {
	public abstract IHat createHat();
	public abstract IShirt createShirt();
	public abstract IPants createPants();
	public abstract IShoes createShoes();
}

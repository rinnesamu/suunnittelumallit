package builder;

public class Hesburger extends Restaurant {
	
	private StringBuilder hamburger;
	
	public Hesburger() {
		hamburger = new StringBuilder();
	}
	
	@Override
	public void buildBun() {
		hamburger.append("Bun,");
		
	}

	@Override
	public void buildCheese() {
		hamburger.append("Cheese,");
		
	}

	@Override
	public void buildPatty() {
		hamburger.append("Patty,");
		
	}

	@Override
	public void buildSalad() {
		hamburger.append("Salad,");
		
	}

	@Override
	public Object getHamburger() {
		return this.hamburger;
	}

}

package builder;

import java.util.ArrayList;
import java.util.List;

public class McDonalds extends Restaurant {

	List<Ingredient> hamburger;
	
	public McDonalds() {
		hamburger = new ArrayList<Ingredient>();
	}

	@Override
	public void buildBun() {
		hamburger.add(new Bun());
		
	}

	@Override
	public void buildCheese() {
		hamburger.add(new Cheese());
		
	}

	@Override
	public void buildPatty() {
		hamburger.add(new Patty());
		
	}

	@Override
	public void buildSalad() {
		hamburger.add(new Salad());
		
	}
	
	public List<Ingredient> getHamburger() {
		return this.hamburger;
	}
}

package builder;

public class Cashier {
	
	private Restaurant restaurant;
	
	public void setRestaurant(Restaurant r) {
		this.restaurant = r;
	}
	
	public void buildHamburger() {
		restaurant.buildBun();
		restaurant.buildCheese();
		restaurant.buildPatty();
		restaurant.buildSalad();
	}
	
	public Object getHamburger() {
		return restaurant.getHamburger();
	}

}

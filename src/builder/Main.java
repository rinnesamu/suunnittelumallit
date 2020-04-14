package builder;

public class Main {

	public static void main(String[] args) {
		Restaurant mcDonalds = new McDonalds();
		Restaurant hesburger = new Hesburger();
		Cashier cashier = new Cashier();
		cashier.setRestaurant(mcDonalds);
		cashier.buildHamburger();
		System.out.println(cashier.getHamburger());
		cashier.setRestaurant(hesburger);
		cashier.buildHamburger();
		System.out.println(cashier.getHamburger());
		

	}

}

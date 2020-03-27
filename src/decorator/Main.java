package decorator;

public class Main {

	public static void main(String[] args) {

		IPizza[] menu = {
				new Pineapple(new Ham(new Base())),
				new Onion(new Tomato(new Olive(new Base()))),
				new Pineapple(new Ham(new Onion(new Tomato(new Olive(new Kebab(new Base())))))) };

		System.out.println("Welcome to pizzeria!");
		System.out.println("Here is our menu:");
		for (int i = 1; i <= menu.length; i++) {
			System.out.println(i + ". " + menu[i - 1].getDescription() + ". "
					+ String.format("%.2f", menu[i - 1].getPrice()) + "€");
		}
	}

}

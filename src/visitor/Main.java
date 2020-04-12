package visitor;

import visitor.Pokemon;

public class Main {

	public static void main(String[] args) {
		Pokemon pokemon = new Pokemon();
		
		for (int i  = 0; i < 75; i++) {
			pokemon.fight();
		}
	}
}

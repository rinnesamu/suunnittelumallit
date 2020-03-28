package state;

import singleton.Printer;

public class Charmander extends PokemonCharacter {
	private static Charmander INSTANCE = null;
	
	private int damage = 3;
	private int healAmount = 2;
	private int totalHp = 20;

	private Charmander() {};
	
	public void attack() {
		System.out.println("Charmander deals " + damage + " damage!");;
	}
	
	public void heal() {
		System.out.println("Charmander heals " + healAmount + " hp");
	}
	
	public void printStats() {
		System.out.println("Charmanders stats: ");
		System.out.println("Damage: " + damage);
		System.out.println("HP: " + totalHp);
		System.out.println("Healing: " + healAmount);
	}
	
	public static Charmander getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmander();
		}
		return INSTANCE;
		
	}
	
	public void evolve(Pokemon p) {
		System.out.println("Your pokemon evolves!");
		changeState(p, Charmaleon.getInstance());
	}
}

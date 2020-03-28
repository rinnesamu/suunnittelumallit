package state;

public class Charmaleon extends PokemonCharacter {
	
	private static Charmaleon INSTANCE = null;
	
	private int damage = 6;
	private int healAmount = 4;
	private int totalHp = 40;

	public void attack() {
		System.out.println("Charmaleon deals " + damage + " damage!");;
	}
	
	public void heal() {
		System.out.println("Charmaleon heals " + healAmount + " hp");
	}
	
	public void printStats() {
		System.out.println("Charmaleons stats: ");
		System.out.println("Damage: " + damage);
		System.out.println("HP: " + totalHp);
		System.out.println("Healing: " + healAmount);
	}
	
	public static Charmaleon getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmaleon();
		}
		return INSTANCE;
		
	}

	@Override
	public void evolve(Pokemon p) {
		System.out.println("Your pokemon evolves!");
		changeState(p, Charizard.getInstance());
	}

}

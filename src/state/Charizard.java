package state;

public class Charizard extends PokemonCharacter {

	private static Charizard INSTANCE = null;

	private int damage = 12;
	private int healAmount = 8;
	private int totalHp = 80;

	public void attack() {
		System.out.println("Charizard deals " + damage + " damage!");
	}

	public void heal() {
		System.out.println("Charizard heals " + healAmount + " hp");
	}

	public void printStats() {
		System.out.println("Charizards stats: ");
		System.out.println("Damage: " + damage);
		System.out.println("HP: " + totalHp);
		System.out.println("Healing: " + healAmount);
	}

	public static Charizard getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charizard();
		}
		return INSTANCE;
	}
}

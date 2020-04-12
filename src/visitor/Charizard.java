package visitor;

public class Charizard extends PokemonCharacter {

	private static Charizard INSTANCE = null;

	private int damage = 12;
	private int healAmount = 8;
	private int totalHp = 80;
	private int exp = 0;
	private Pokemon p;
	
	private Charizard(Pokemon p) {
		this.p = p;
	}

	public void attack() {
		System.out.println("Charizard deals " + damage + " damage!");
		exp++;
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

	public static Charizard getInstance(Pokemon p) {
		if (INSTANCE == null) {
			INSTANCE = new Charizard(p);
		}
		return INSTANCE;
	}
	public int getExp() {
		return this.exp;
	}
}

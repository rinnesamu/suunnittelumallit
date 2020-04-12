package visitor;

public class Charmander extends PokemonCharacter {
	private static Charmander INSTANCE = null;
	
	private int damage = 3;
	private int healAmount = 2;
	private int totalHp = 20;
	private int exp = 0;
	private Visitor v;
	private Pokemon p;

	private Charmander(Pokemon p, Visitor v) {
		this.p = p;
		this.v = v;
	};
	
	public void attack() {
		System.out.println("Charmander deals " + damage + " damage!");
		exp++;
		if (v.levelUp(this) == true) {
			evolve(p);
		};
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
	
	public static Charmander getInstance(Pokemon p, Visitor v) {
		if (INSTANCE == null) {
			INSTANCE = new Charmander(p, v);
		}
		return INSTANCE;
		
	}
	public void evolve(Pokemon p) {
		System.out.println("Your pokemon evolves!");
		changeState(p, Charmaleon.getInstance(p, v));
	}
	public int getExp() {
		return this.exp;
	}
}

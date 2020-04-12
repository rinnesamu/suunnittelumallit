package visitor;

public class Charmaleon extends PokemonCharacter {
	
	private static Charmaleon INSTANCE = null;
	
	private int damage = 6;
	private int healAmount = 4;
	private int totalHp = 40;
	private int exp = 0;
	private Visitor v;
	private Pokemon p;
	
	private Charmaleon(Pokemon p, Visitor v) {
		this.p = p;
		this.v = v;
	}

	public void attack() {
		System.out.println("Charmaleon deals " + damage + " damage!");
		exp++;
		if (v.levelUp(this) == true) {
			evolve(p);
		};
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
	
	public static Charmaleon getInstance(Pokemon p, Visitor v) {
		if (INSTANCE == null) {
			INSTANCE = new Charmaleon(p, v);
		}
		return INSTANCE;
		
	}

	@Override
	public void evolve(Pokemon p) {
		System.out.println("Your pokemon evolves!");
		changeState(p, Charizard.getInstance(p));
	}
	public int getExp() {
		return this.exp;
	}

}

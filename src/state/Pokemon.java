package state;

public class Pokemon {

	private IPokemonCharacter pokemonCharacter;
	private int attackCount;
	
	public Pokemon() {
		this.pokemonCharacter = Charmander.getInstance();
		this.pokemonCharacter.printStats();
		this.attackCount = 0;
	}
	
	protected void changeState(IPokemonCharacter p) {
		this.pokemonCharacter = p;
		
	}
	
	public void fight() {
		pokemonCharacter.attack();
		pokemonCharacter.heal();
		attackCount++;
		if (attackCount == 10) {
			pokemonCharacter.evolve(this);
			pokemonCharacter.printStats();
			attackCount = 0;
		}
	}
}

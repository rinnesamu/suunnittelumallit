package visitor;

public class Pokemon {

	private IPokemonCharacter pokemonCharacter;
	private Visitor v = new LevelUp();
	
	public Pokemon() {
		this.pokemonCharacter = Charmander.getInstance(this, v);
		this.pokemonCharacter.printStats();
	}
	
	protected void changeState(IPokemonCharacter p) {
		this.pokemonCharacter = p;
		pokemonCharacter.printStats();
		
	}
	
	public void fight() {
		pokemonCharacter.attack();
		pokemonCharacter.heal();
	}
	
	public void evolvePokemon() {
		pokemonCharacter.evolve(this);
	}
}

package state;

public abstract class PokemonCharacter implements IPokemonCharacter {

	@Override
	public void attack() {}

	@Override
	public void heal() {}

	@Override
	public void printStats() {}

	@Override
	public void changeState(Pokemon p, IPokemonCharacter ip) {
		p.changeState(ip);
	}
	
	public void evolve(Pokemon p) {
		System.out.println("You cannot evolve");
	}

}

package state;

public interface IPokemonCharacter {
	
	public void attack();
	public void heal();
	public void printStats();
	public void changeState(Pokemon p, IPokemonCharacter ip);
	public void evolve(Pokemon p);
}

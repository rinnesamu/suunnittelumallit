package memento;

public class Player implements Runnable {
	private String name;
	private Riddler riddler;
	private Object obj;
	
	public Player(String name, Riddler r) {
		this.name = name;
		this.riddler = r;
		this.obj = riddler.joinGame();
	}
	

	@Override
	public void run() {
		boolean guessed;
		int guessNumber = 0;
		do {
			guessNumber++;
			System.out.println(this.name + " guessed " + guessNumber);
			guessed = riddler.guessNumber(guessNumber, obj);
		}while (guessed == false);
		
		System.out.println("Player " + this.name + " guessed right! Number was " + guessNumber);
		
	}
	

}

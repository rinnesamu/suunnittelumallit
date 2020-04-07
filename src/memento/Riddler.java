package memento;

import java.util.Random;

public class Riddler {
	private Random r;
	private final int MAX = 10;
	private final int MIN = 1;
	
	public Riddler() {
		r = new Random();
	}
	
	public synchronized boolean guessNumber(int number, Object o) {
		Memento m = (Memento)o;
		if (number == m.getNumberToGuess()) {
			return true;
		}
		return false;
	}
	
	public Object joinGame() {
		return new Memento(r.nextInt(MAX - MIN + 1) + MIN);
	}
	
	private class Memento{
		private int numberToGuess;
		
		public Memento(int number) {
			this.numberToGuess = number;
		}
		
		public int getNumberToGuess() {
			return numberToGuess;
		}
	}

}

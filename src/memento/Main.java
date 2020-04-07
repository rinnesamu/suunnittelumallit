package memento;

public class Main {

	public static void main(String[] args) {
		Riddler r = new Riddler();
		Player player = new Player("Player1", r);
		Thread player1 = new Thread(player);
		player = new Player("Player2", r);
		Thread player2 = new Thread(player);
		player1.start();
		player2.start();

	}

}

package templatemethod;

import java.util.Scanner;

public class DiceGame extends Game {

	private int winner = -1;
	static Scanner scanner = new Scanner(System.in);

	@Override
	void initializeGame() {
		System.out.println("Game starts!");
	}

	@Override
	void makePlay(int player) {
		System.out.println("Player " + (+player+1) + " turn");
		System.out.println("Type anything to throw a dice!");
		scanner.nextLine();
		int dice = throwDice();
		if (dice == 6) {
			winner = player+1;
		}
		System.out.println("You threw " + dice + "!");

	}

	@Override
	boolean endOfGame() {
		if (winner != -1) {
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		System.out.println("Player " + winner + " wins!");

	}

	private int throwDice() {
		return (int) (Math.random() * 6 + 1);
	}

}

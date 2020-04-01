package templatemethod;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Game game;
		boolean correctInput = false;
		int ans = -1;
		System.out.println("Do you want to play:");
		System.out.println("1. Tic-Tac-Toe (Only 2 players)");
		System.out.println("2. Dice game");
		System.out.println("type 1 or 2");
		do {
			try {
				ans = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
			}
			if (ans == 1 || ans == 2) {
				correctInput = true;
			} else {
				System.out.println("Please type 1 or 2");
			}
		} while (correctInput == false);
		if (ans == 1) {
			game = new TicTacToe();
			game.playOneGame(2);
		} else {
			ans = -1;
			correctInput = false;
			game = new DiceGame();
			do {
				System.out.println("How many players?");
				try {
					ans = Integer.parseInt(scanner.nextLine());
				} catch (Exception e) {
				}
				if (ans <= 0) {
					System.out.println("Please type positive integer");
				} else {
					correctInput = true;
				}
			} while (correctInput == false);
			game.playOneGame(ans);
		}

	}

}

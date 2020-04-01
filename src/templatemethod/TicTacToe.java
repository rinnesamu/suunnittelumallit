package templatemethod;

import java.util.Scanner;

public class TicTacToe extends Game {

	private String[] board = new String[9];
	static Scanner scanner = new Scanner(System.in);
	private int turnsPlayed = 0;
	private String winner = "";

	@Override
	void initializeGame() {
		int tileNumber = 1;
		for (int i = 0; i < 9; i++) {
			board[i] = Integer.toString(tileNumber) ;
			tileNumber++;
		}
	}

	@Override
	void makePlay(int player) {
		boolean illegalMove = true;
		System.out.println("Player " + (+player+1) + " turn!");
		printBoard();
		String ans;
		int ansInt = -1;
		do {
			System.out.println("type integer to place your mark!");
			ans = scanner.nextLine();
			try {
				ansInt = Integer.parseInt(ans);
			}catch (Exception e) {
				System.out.println("Please type integer");
			}
			if(ansInt <= 0 || ansInt > 9 || !board[ansInt-1].equals(ans)) {
				System.out.println("Please type integer that you can see in game board!");
			} else {
				illegalMove = false;
				if (player == 0) {
					board[ansInt-1] = "X";
				}else {
					board[ansInt-1] = "O";
				}
			}
		} while (illegalMove == true);
		turnsPlayed++;
	}

	@Override
	boolean endOfGame() {
		if (board[0].equals(board[1]) && board[0].equals(board[2])) {
			winner = board[0];
			return true;
		}else if (board[3].equals(board[4]) && board[3].equals(board[5])) {
			winner = board[3];
			return true;
		}
		else if (board[6].equals(board[7]) && board[6].equals(board[8])) {
			winner = board[6];
			return true;
		}
		else if (board[0].equals(board[3]) && board[0].equals(board[6])) {
			winner = board[0];
			return true;
		}else if (board[1].equals(board[4]) && board[1].equals(board[7])) {
			winner = board[1];
			return true;
		}else if (board[2].equals(board[5]) && board[2].equals(board[8])) {
			winner = board[2];
			return true;
		}else if (board[0].equals(board[4]) && board[0].equals(board[8])) {
			winner = board[0];
			return true;
		}else if (board[2].equals(board[4]) && board[3].equals(board[6])) {
			winner = board[2];
			return true;
		}else if(turnsPlayed == 9) {
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		if (winner.equals("X")) {
			System.out.println("Player 1 wins!");
		}else if (winner.contentEquals("O")) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("Tie!");
		}

	}
	
	private void printBoard() {
		for (int i = 0; i < 9; i++) {
			System.out.print(board[i]);
			if (i % 3 == 2) {
				System.out.print("\n");
			}
		}
	}

}

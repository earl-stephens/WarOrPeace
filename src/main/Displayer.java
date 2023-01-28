package main;

import java.util.Scanner;

public class Displayer {

	public void loadScreen(int deckSize, String player1Name, String player2Name) {
		System.out.println("Welcome to War! (Or Peace) This game will be played with " + deckSize + " cards.");
		System.out.println("The players today are " + player1Name + " and " + player2Name);
		System.out.println("Type 'GO' to start the game.");
		System.out.println("------------------------------------------------------------------");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		while(!input.equals("GO")) {
			System.out.println("Incorrect input.  Please type 'GO' to start the game");
			input = scanner.next();
		}
		scanner.close();
	}
}

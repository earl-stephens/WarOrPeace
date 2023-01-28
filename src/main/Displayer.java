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
	
	public void turnOutcome(int counter, String type, String name) {
		switch(type)  {
		case "basic":
			System.out.println("Turn " + counter + ": " + name + " won 2 cards.");
			break;
		case "war":
			System.out.println("Turn " + counter + ": " + type + " - " + name + " won 6 cards.");
			break;
		case "mutually_assured_destruction":
			System.out.println("Turn " + counter + ": *mutually assured destruction* 6 cards removed from play");
			break;
		}
	}
}
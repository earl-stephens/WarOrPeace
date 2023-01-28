package main;

import java.io.FileNotFoundException;

public class WarOrPeace {
	public static void main(String[] args) throws FileNotFoundException {
		Runner runner = new Runner();
		try {
			runner.getFullDeck();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
		runner.createTwoDecks();
		runner.createPlayers();
		runner.start();
	}
}

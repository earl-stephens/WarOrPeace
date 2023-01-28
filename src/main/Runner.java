package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Runner {
	public ArrayList<Card> fullDeck = new ArrayList<>();
	public int fullDeckSize;
	public ArrayList<Card> deck1Cards = new ArrayList<>();
	public ArrayList<Card> deck2Cards = new ArrayList<>();
	public Player player1;
	public Player player2;
	public Deck deck1;
	public Deck deck2;
	
	public void getFullDeck() throws FileNotFoundException {
		try{
			Scanner diskScanner = new Scanner(new File("cards.txt"));
			while(diskScanner.hasNextLine()) {
				String line = diskScanner.nextLine();
				String[] cardInfo = line.split(",");
				Card card = new Card(cardInfo[0], cardInfo[1], Integer.parseInt(cardInfo[2]));
				fullDeck.add(card);
			}
			diskScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		fullDeckSize = fullDeck.size();
	}
	
	public void createTwoDecks() {
		for(int i = 51; i > 25; i--) {
			Random random = new Random();
			int randomCard = random.nextInt(i);
			deck1Cards.add(fullDeck.get(randomCard));
			fullDeck.remove(randomCard);
		}
		for(int i = 26; i > 0; i--) { 
			Random random = new Random();
			int randomCard = random.nextInt(i);
			deck2Cards.add(fullDeck.get(randomCard));
			fullDeck.remove(randomCard); 
		} 
		deck1 = new Deck(deck1Cards);
		deck2 = new Deck(deck2Cards);
	}
	
	public void createPlayers() {
		player1 = new Player("Megan", deck1);
		player2 = new Player("Aurora", deck2);
	}
	
	public void start() {
		Displayer displayer = new Displayer();
		Turn turn = new Turn(player1, player2);
		displayer.loadScreen(fullDeckSize, player1.name, player2.name);
		
		int counter = 0;
		while(counter < 1000001) {
			displayer.turnOutcome(counter, turn.type(), turn.winner().name);
		turn.pile_cards();
		
		if(player1.has_lost() || player2.has_lost()) {
			displayer.winnerMessage(player1, player2);
			break;
		}
		
		turn.award_spoils(turn.winner());
		counter++;
		}
		
		if(counter == 1000000) {
			displayer.draw();
		}
	}
}

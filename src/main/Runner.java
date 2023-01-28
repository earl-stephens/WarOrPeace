package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	public ArrayList<Card> fullDeck = new ArrayList<>();
	public ArrayList<Card> deck1Cards = new ArrayList<>();
	public ArrayList<Card> deck2Cards = new ArrayList<>();
	
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
		} catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
	
	public void createTwoDecks() {
		for(int i = 51; i > 25; i--) {
			int randomCard = (int)Math.random() * i;
			deck1Cards.add(fullDeck.get(randomCard));
			fullDeck.remove(randomCard);
		}
		for(int i = 25; i >= 0; i--) { 
			deck2Cards.add(fullDeck.get(i));
			fullDeck.remove(i); 
		} 
	}
}

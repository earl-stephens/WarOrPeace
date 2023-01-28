package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	public ArrayList<Card> fullDeck = new ArrayList<>();
	
	public void getFullDeck() throws FileNotFoundException {
		try{
			Scanner diskScanner = new Scanner(new File("cards.txt"));
			while(diskScanner.hasNextLine()) {
				String line = diskScanner.nextLine();
				String[] cardInfo = line.split(",");
				System.out.println(cardInfo[0] + cardInfo[1] + cardInfo[2]);
				Card card = new Card(cardInfo[0], cardInfo[1], Integer.parseInt(cardInfo[2]));
				fullDeck.add(card);
			}
			diskScanner.close();
		} catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}

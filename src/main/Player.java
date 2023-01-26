package main;

public class Player {
	public String name;
	public Deck deck;
	
	public Player(String name, Deck deck) {
		this.name = name;
		this.deck = deck;
	}
	
	public boolean has_lost() {
		boolean result = false;
		if(deck.cards.size() == 0) {
			result = true;
		}
		return result;
	}
}

package main;

import java.util.ArrayList;

public class Deck {
	public Card[] cards;
	
	public Deck(Card[] cards) {
		this.cards = cards;
	}
	
	public ArrayList<Card> high_ranking_cards() {
		ArrayList<Card> highRankingCards = new ArrayList<>();
		
		for(Card tempArray: cards) {
			if(tempArray.rank >= 11) {
				highRankingCards.add(tempArray);
			}
		}
		return highRankingCards;
	}
}

package main;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Deck {
	public ArrayList<Card> cards;
	
	public Deck(ArrayList<Card> cards) {
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
	
	public double percent_high_ranking() {
		double numberHighRanking = high_ranking_cards().size();
		double totalCards = cards.size();
		double result = (numberHighRanking / totalCards) * 100;
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.parseDouble(df.format(result));
	}
	
	public Card remove_card() {
		Card firstCard = cards.get(0);
		cards.remove(0);
		return firstCard;
	}
	
	public void add_card(Card card) {
		cards.add(card);
	}
}

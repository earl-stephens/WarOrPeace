package main;

import java.text.DecimalFormat;
import java.text.NumberFormat;
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
	
	public double percent_high_ranking() {
		double numberHighRanking = high_ranking_cards().size();
		double totalCards = cards.length;
		double result = (numberHighRanking / totalCards) * 100;
		DecimalFormat df = new DecimalFormat("#.##");
		return Double.parseDouble(df.format(result));
	}
}

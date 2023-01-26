package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DeckTest {

	@Test
	void testThatDeckExists() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);		
		Deck deck = new Deck(cards);
		
		Assert.assertNotNull(deck);
	}
	
	@Test
	void testThatDeckHasCardAtribute() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);		
		Deck deck = new Deck(cards);
		
		Assert.assertEquals(3, deck.cards.size());
	}
	
	@Test
	void testThatCanGetIndividualCardRank() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		Deck deck = new Deck(cards);
		
		Assert.assertEquals(12, deck.cards.get(0).rank);
		Assert.assertEquals(14, deck.cards.get(2).rank);
	}
	
	@Test
	void testThatCanGetHighRankingCards() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		Deck deck = new Deck(cards);
		
		Assert.assertEquals(2, deck.high_ranking_cards().size());
		Assert.assertEquals("Queen", deck.high_ranking_cards().get(0).value);
		Assert.assertEquals("heart", deck.high_ranking_cards().get(1).suit);
	}
	
	@Test
	void testThatCanGetPercentHighRankingCards() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		Deck deck = new Deck(cards);
		
		Assert.assertEquals(66.67, deck.percent_high_ranking(), 0.02);
	}
	
	@Test
	void testThatCanRemoveCard() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);		
		Deck deck = new Deck(cards);
		
		Assert.assertEquals(card1, deck.remove_card());
		Assert.assertEquals(2, deck.cards.size());
		Assert.assertEquals(1, deck.high_ranking_cards().size());
		Assert.assertEquals(50.00, deck.percent_high_ranking(), 0.02);
	}
	
	@Test
	void testThatCanAddACard() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);		
		Deck deck = new Deck(cards);
		deck.remove_card();
		
		Card card4 = new Card("club", "5", 5);
		deck.add_card(card4);
		
		Assert.assertEquals(3, deck.cards.size());
		Assert.assertEquals("Ace", deck.high_ranking_cards().get(0).value);
		Assert.assertEquals(33.33, deck.percent_high_ranking(), 0.02);
	}

}

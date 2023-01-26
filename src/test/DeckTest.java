package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DeckTest {

	@Test
	void testThatDeckExists() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		Card[] cards = {card1, card2, card3};
		
		Deck deck = new Deck(cards);
		
		Assert.assertNotNull(deck);
	}
	
	@Test
	void testThatDeckHasCardAtribute() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		Card[] cards = {card1, card2, card3};
		
		Deck deck = new Deck(cards);
		
		Assert.assertEquals(3, deck.cards.length);
	}
	
	@Test
	void testThatCanGetIndividualCardRank() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		Card[] cards = {card1, card2, card3};
		Deck deck = new Deck(cards);
		
		Assert.assertEquals(12, deck.cards[0].rank);
		Assert.assertEquals(14, deck.cards[2].rank);
	}
	
	@Test
	void testThatCanGetHighRankingCards() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		Card[] cards = {card1, card2, card3};
		Deck deck = new Deck(cards);
		
		Assert.assertEquals(2, deck.high_ranking_cards().size());
		Assert.assertEquals("Queen", deck.high_ranking_cards().get(0).value);
		Assert.assertEquals("heart", deck.high_ranking_cards().get(1).suit);
	}

}

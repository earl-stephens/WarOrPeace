package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DeckTest {

	@Test
	void testThatDekExists() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		Card[] cards = {card1, card2, card3};
		
		Deck deck = new Deck(cards);
		
		Assert.assertNotNull(deck);
	}

}

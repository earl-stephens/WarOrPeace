package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {
	public Player player;
	
	@BeforeEach
	void init() {
		Card card1 = new Card("diamond", "Queen", 12);
		Card card2 = new Card("spade", "3", 3);
		Card card3 = new Card("heart", "Ace", 14);
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);
		Deck deck = new Deck(cards);
		
		player = new Player("Clarisa", deck);
	}

	@Test
	void testForAPlayerObject() {
		
		Assert.assertNotNull(player);
	}
	
	@Test
	void testForPlayerAttributes() {
		
		Assert.assertEquals("Clarisa", player.name);
		Assert.assertEquals(3, player.deck.cards.size());
	}
	
	@Test
	void testForIfPlayerHasLost() {
		player.deck.remove_card();
		Assert.assertFalse(player.has_lost());
		
		player.deck.remove_card();
		Assert.assertFalse(player.has_lost());
		
		player.deck.remove_card();
		Assert.assertTrue(player.has_lost());
		
		Assert.assertEquals(0, player.deck.cards.size());
	}
}

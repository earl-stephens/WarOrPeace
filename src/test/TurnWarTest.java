package test;
import main.*;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

class TurnWarTest {
	public Turn turn;
	public Player player1;
	public Player player2;
	
	@BeforeEach
	void init() {
		Card card1 = new Card("heart", "Jack", 11);
		Card card2 = new Card("heart", "10", 10);
		Card card3 = new Card("heart", "9", 9);
		Card card4 = new Card("diamond", "Jack", 11);
		Card card5 = new Card("heart", "8", 8);
		Card card6 = new Card("diamond", "Queen", 12);
		Card card7 = new Card("heart", "3", 3);
		Card card8 = new Card("diamond", "2", 2);
		ArrayList<Card> cards1 = new ArrayList<>();
		ArrayList<Card> cards2 = new ArrayList<>();
		cards1.add(card1);
		cards1.add(card2);
		cards1.add(card5);
		cards1.add(card8);
		
		cards2.add(card4);
		cards2.add(card3);
		cards2.add(card6);
		cards2.add(card7);
		
		Deck deck1 = new Deck(cards1);
		Deck deck2 = new Deck(cards2);
		
		Player player1 = new Player("Megan", deck1);
		Player player2 = new Player("Aurora", deck2);
		
		turn = new Turn(player1, player2);
	}
	
	@Test
	void testForWarType() {
		Assert.assertEquals("war", turn.type());
	}

	@Test
	void testForWinnerInWarType() {
		Assert.assertEquals("Aurora", turn.winner().name);
		Assert.assertNotEquals("Megan", turn.winner().name);
	}
}

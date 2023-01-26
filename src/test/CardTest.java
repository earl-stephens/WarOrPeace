package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CardTest {

	@Test
	void testThatCardExists() {
		Card card = new Card("heart", "Jack", 11);
		
		Assert.assertNotNull(card);
	}

	@Test
	void testForCardAttributes() {
		Card card = new Card("heart", "Jack", 11);
		
		Assert.assertEquals("heart", card.suit);
		Assert.assertEquals("Jack", card.value);
		Assert.assertEquals(11, card.rank);
	}
}

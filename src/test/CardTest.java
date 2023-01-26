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

}

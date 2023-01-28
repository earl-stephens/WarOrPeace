package test;
import main.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RunnerTest {

	@Test
	void testForARunnerClassInstance() {
		Runner runner = new Runner();
		
		Assert.assertNotNull(runner);
	}

	@Test
	void testForAFullDeckOfCards() throws Exception {
		Runner runner = new Runner();
		runner.getFullDeck();
		
		Assert.assertEquals(52, runner.fullDeck.size());
	}
}

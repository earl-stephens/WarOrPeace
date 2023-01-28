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

}

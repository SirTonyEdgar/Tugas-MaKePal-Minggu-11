package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class CounterTest {

	@Test
	public void testsiudfbngibhnsdg() {
		Counter testCounter = new Counter();

		for (int i = 0; i < 50; i++) {
			testCounter.increment();
		}

		testCounter.reset();

		assertEquals(testCounter.getCount(), 0);
	}

	@Test
	public void testInaregaergaergaergaerg() {
		Counter testCounter = new Counter();

		for (int i = 1; i < 50; i++) {
			testCounter.increment();
			assertEquals(testCounter.getCount(), i);
		}
	}

	@Test
	public void testaergaergaergaerg() {
		Counter testCounter = new Counter();

		for (int i = 1; i < 10; i++) {
			testCounter.decrement();
			assertEquals(testCounter.getCount(), i * -1);
		}
	}

}

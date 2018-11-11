import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StarterTest {

	@Test
	void addNumbersSame() {
		assertEquals(0, StarterClass.add(0, 0));
		assertEquals(8, StarterClass.add(4, 4));
	}

	@Test
	void addNumbersDifferent() {
		assertEquals(-1, StarterClass.add(-2, 1));
		assertEquals(8, StarterClass.add(3, 5));
	}
	
	@Test
	void multiplyNumbersSame() {
		assertEquals(0, StarterClass.multiply(0, 0));
		assertEquals(16, StarterClass.multiply(4, 4));
	}

	@Test
	void multiplyNumbersDifferent() {
		assertEquals(-2, StarterClass.multiply(-2, 1));
		assertEquals(15, StarterClass.multiply(3, 5));
	}
}

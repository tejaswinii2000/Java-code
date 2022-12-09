package labcodes;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class CalTest {

	@Test
	public void caltest() {
		assertEquals("error in add()", 7, Calculator.add(3, 4));
		assertEquals("error in add()", 2, Calculator.add(2, 0));
		assertEquals("error in add()", -7, Calculator.add(-5,-2));
	}

	public void calcTestAddFail() {
		assertEquals("error in add()", 0, Calculator.add(1, 2));
	}

	public void calcTestSubPass() {
		assertEquals("error in sub()", 2, Calculator.add(5, 3));
		assertEquals("error in sub()", 2, Calculator.add(2, 0));
		assertEquals("error in sub()", -2, Calculator.add(-5,-2));
	}

	public void calcTestSubFail() {
		assertEquals("error in sub()", 0, Calculator.add(2, 1));
	}

	public void calcTestMultPass() {
		assertEquals("error in mult()", 6, Calculator.add(2, 3));
		assertEquals("error in mult()", 0, Calculator.add(5, 0));
		assertEquals("error in mult()", 28, Calculator.add(7, 4));
	}

	public void calcTestMultFail() {
		assertEquals("error in mult()", 0, Calculator.add(1, 2));
	}



}
 
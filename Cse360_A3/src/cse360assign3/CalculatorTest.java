package cse360assign3;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator c = new Calculator();
		
		assertNotNull("The Calculator is NULL", c);
	}

	@Test
	public void testGetTotal() {
		//fail("Not yet implemented");
		Calculator c = new Calculator();
		
		assertEquals(c.getTotal(), 0);
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		Calculator c = new Calculator();
		
		c.add(5);
		assertEquals("The total is not equal to 5!", c.getTotal(), 5);
		
		c.add(5);
		assertEquals(c.getTotal(), 10);
	}

	@Test
	public void testSubtract() {
		Calculator c = new Calculator();
		
		c.add(5);
		c.subtract(3);
		assertEquals(c.getTotal(), 2);
		
		c.add(5);
		c.subtract(3);
		assertEquals(c.getTotal(), 4);
	}

	@Test
	public void testMultiply() {
		Calculator c = new Calculator();

		c.add(5);
		c.multiply(3);
		assertEquals(c.getTotal(), 75);
	}

	@Test
	public void testDivide() {
		Calculator c = new Calculator();

		c.add(15);
		c.divide(3);
		assertEquals(c.getTotal(), 5);
	}
	
	@Test
	public void testDivideByZero() {
		Calculator c = new Calculator();

		c.add(15);
		c.divide(0);
		assertEquals(c.getTotal(), 0);
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}

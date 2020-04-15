package epam.testing;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpClass() {
		// code executed before all test methods
		fail("Not yet implemented");
	}
	@Test
	public void testAdd() {
		// test method for addition
		Calculator calculator = new Calculator();
	    int a = 1234;
	    int b = 5678;
	    int actual = calculator.add(a, b);//created test for add method
	 
	    int expected = 6912;
	 
	    assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		// test method
		Calculator calculator = new Calculator();
	    int a = 1234;
	    int b = 5678;
	    int actual = calculator.subtract(b, a);//created test for subtract method
	 
	    int expected = 4444;
	 
	    assertEquals(expected, actual);
	}
}
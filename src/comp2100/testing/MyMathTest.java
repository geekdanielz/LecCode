package comp2100.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	private MyMath math;
	
	@Before
	public void createMath() {
		math = new MyMath();
	}

	@Test
	public void testSumFloor() {
		assertEquals(1, math.sumAndFloor(0.6f, 0.7f));
		
		// will not pass the test because of floating point precision, 0.9f-0.1f != 0.8f
		assertEquals(1, math.sumAndFloor(0.1f, 0.9f));
	}
	
	@Test
	public void testAdd() {
		//Basic test		
		assertEquals(3, math.add(1, 2));
		assertEquals(4, math.add(1, 3));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivideZero() {
		// divide by zero will raise ArithmeticException
		assertEquals(0, math.divide(1, 0), 1e-10);
	}
	
	@Test
	public void testDivide() {
		// double or float number comparison requires delta
		assertEquals(0.3333333, math.divide(1, 3), 0.000001);
	}
	
}

package comp2100.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	@Test
	public void testSumFloor() {
		assertEquals(1, MyMath.sumAndFloor(0.6f, 0.7f));
	}
	
	@Test
	public void testAdd() {
		MyMath math = new MyMath();
		
		assertEquals(3, math.add(1, 2));
		assertEquals(4, math.add(1, 3));
	}

}

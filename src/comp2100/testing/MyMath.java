/**
 * Example class for testing
 * 
 * @author dongwookim
 */
package comp2100.testing;

public class MyMath {

	/**
	 * This method will return floored result of two floating numbers.
	 * 
	 * @param	a	the first floating number
	 * @param	b	the second floating number
	 * @return	floored sum of two floating number {@code a} and {@code b}
	 */
	public static int sumAndFloor(float a, float b) {
		return (int)(((a + 0.1) + (b - 0.1)));
	}
}

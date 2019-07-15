/**
 * Example class for testing
 * 
 * @author dongwookim
 */
package comp2100.testing;

public class MyMath {

	/**
	 * This method will return floored result of two floating numbers.
	 * @param	a	The first floating number
	 * @param	b	The second floating number
	 * @return	floored sum of two floating number {@code a} and {@code b}
	 */
	public static int sumAndFloor(float a, float b) {
		return (int)(((a + 0.1) + (b - 0.1)));
	}
	
	/**
	 * Return sum of two integer {@code a} and {@code b}.
	 * @param a The first integer value
	 * @param b The second integer value
	 * @return sum of two values
	 */
	public int add(int a, int b) {
		return (a+b);
	}
}
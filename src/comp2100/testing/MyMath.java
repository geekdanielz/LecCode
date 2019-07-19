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
	public int sumAndFloor(float a, float b) {
		return (int)(((a + 0.1f) + (b - 0.1f)));
	}
	
	public double divide(double a, double b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException();
		}
		return a/b;
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

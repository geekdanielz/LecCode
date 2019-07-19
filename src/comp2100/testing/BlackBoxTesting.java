/**
 * BlackBox testing example
 * 
 * @author dongwookim
 */
package comp2100.testing;

public class BlackBoxTesting {

	/**
	 * We know that {@link MyMath} class implements 
	 * {@link MyMath#sumAndFloor(float, float)} static method, 
	 * which takes two floating value and return floor of sum of two values.
	 */	
	public static void main(String args[]) {
		
		int result = new MyMath().sumAndFloor(0.8f, 0.8f);
		
		System.out.println("The result should be 1, actual result is: " + result);
	}
}

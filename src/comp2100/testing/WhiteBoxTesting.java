/**
 * White-box testing example
 * 
 * @author dongwookim
 */
package comp2100.testing;

public class WhiteBoxTesting {

	/**
	 * Let's look at the actual implementation of 
	 * {@link MyMath#sumAndFloor(float, float)}
	 * and create some test example.
	 */
	public static void main(String args[]) {
		
		int result = MyMath.sumAndFloor(1.3f, 0.7f);
		
		System.out.println("The result should be 2, actual result is: " + result);
	}
}

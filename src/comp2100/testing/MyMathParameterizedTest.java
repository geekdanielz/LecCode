package comp2100.testing;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyMathParameterizedTest {
	
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { 0.7f, 0.3f, 1}, { 0.4f, 0.2f, 0}  
           });
    }
    
    @Parameter(0)
    public float a;
    @Parameter(1)
    public float b;
    @Parameter(2)
    public int expected;
    
	@Test
	public void test() {
		assertEquals(expected, MyMath.sumAndFloor(a, b));
	}

}

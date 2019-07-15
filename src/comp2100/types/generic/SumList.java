package comp2100.types.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumList {

	  public static double sumOfList(List<? extends Number> list) {
	      double s = 0.0;
	      for (Number n : list)
	          s += n.doubleValue();
	      return s;
	  }
	  
	  public static void addNumbers(List<? super Integer> list) {
	      for (int i = 1; i <= 10; i++) {
	          list.add(i);
	      }
	  }


	  public static void main(String args[]) {
		  List<Integer> li = Arrays.asList(1, 2, 3);
		  System.out.println("sum = " + sumOfList(li));
		  
		  List<Integer> list = new ArrayList<Integer>();
		  addNumbers(list);
	  }
	  
}

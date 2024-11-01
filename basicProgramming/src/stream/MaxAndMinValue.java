package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxAndMinValue {
	static List<Integer> intvalue = Arrays.asList(1,2,4,15,30,-5,80,100,25,30,200,-1,-10);
	
	public static Integer minValue() {
		Optional<Integer> minv = intvalue.stream().min((v1,v2) -> v1.compareTo(v2));
		System.out.println("Print the minimum value = " + minv);
		
		// To get the final value we need to use the get() method
		Integer finalvalue = minv.get();
		return finalvalue;
	}
	
	public static Integer maxValue() {
		Optional<Integer> maxv = intvalue.stream().max((v1,v2) -> v1.compareTo(v2));
		System.out.println("Print the maximum value = " + maxv);
		
		// To get the final value we need to use the get() method
		Integer finalvalue = maxv.get();
		return finalvalue;
	}
	
	public static void main (String [] args) {
		System.out.println("Print the final minimum value = "+minValue());
		System.out.println("----------------------------------------------");
		System.out.println("Print the final minimum value = "+maxValue());
	}
	

}

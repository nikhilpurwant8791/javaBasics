package stream;

import java.util.*;
import java.util.stream.Collectors;

public class FilterMethod {
	static List <Integer> number;
	static List <Integer> evenNum = new ArrayList<Integer>();
	//Create List of integers	
	public static List<Integer> listOfIntegers(){
		number = new ArrayList<Integer>();
		for (int i=1; i<100; i++) {
			number.add(i);
		}
		return number;
	}
	//Identify even integers
	public static List<Integer> evenNumber() {
		evenNum = listOfIntegers().stream().filter(n -> n%2==0).collect(Collectors.toList());
		return evenNum;
	}
	//Provide any number and identity how many numbers are divisible by that given number upto 100
	public static List<Integer> genericMethod(int g) {
		evenNum = listOfIntegers().stream().filter(n -> n%g==0).collect(Collectors.toList());
		return evenNum;
	}

	//Instead of returning the value print the value using stream.
	public static void printvalue() {
		listOfIntegers().stream().filter(n -> n%3==0).forEach(n -> System.out.print(n+", "));
	}

	//Multiple condition
public static List<Integer> multipleConditions() {
	List<Integer> evenNumberUpto50 = listOfIntegers().stream().filter(n -> n%2==0 && n<50).collect(Collectors.toList());
	return evenNumberUpto50;
}

	public static void main (String[] args) {
		System.out.println("Even Numbers = " + evenNumber());
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Numbers divisible by input parameter = "+ genericMethod(7));
		System.out.println("----------------------------------------------------------------------------");
		System.out.print("Numbers divisible by 3 = ");
		printvalue();
		System.out.println("\n----------------------------------------------------------------------------");
		System.out.println("evenNumberUpto50 = "+ multipleConditions());
	}

}

package stream;

import java.util.*;
import java.util.stream.Collectors;

public class FilterMethod_EvenNumber {
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

	public static void main (String[] args) {
		System.out.println("Even Numbers = " + evenNumber());
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Numbers divisible by input parameter = "+ genericMethod(7));
	}

}

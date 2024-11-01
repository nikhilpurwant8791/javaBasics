package stream;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapMethod {
	/*
	 * 1. Using flatMap() we can handle multiple list's.
	 */
	
	public static List<Integer> multipleList() {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> list2 = Arrays.asList(8,9,10,11,12,13);
		List<Integer> list3 = Arrays.asList(14,15,16,17,18,19);
		
		// Add all list's in a common list use "<List<Integer>>"
		List<List<Integer>> commonList = Arrays.asList(list1, list2, list3);
		System.out.println("Commaon List of Array = " + commonList);
		
		/*
		 * 1. Create stream using common list.
		 * 2. In stream() use flatMap() function
		 */
		List <Integer> finalCommonList = new ArrayList<Integer>();
		
		// flatmap() add each list as stream and creat common stream
		finalCommonList = commonList.stream().flatMap(n -> n.stream()).map(n -> n+10).collect(Collectors.toList());
		
		// We can write it as...
		List<Integer> finalCommonListAnotherMethod = commonList.stream().flatMap(n -> n.stream().map(x -> x+10)).collect(Collectors.toList());
		System.out.println("Final Common List using map() inside the flatMap() = " + finalCommonListAnotherMethod);
		return finalCommonList;
	}
	
	public static void main (String[] args) {
//		multipleList();
		System.out.println("\nFinal Common List = "+ multipleList());
	}

}

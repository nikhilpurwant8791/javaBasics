package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.tools.DiagnosticCollector;

public class Basic1 {

	public static List<Integer> generateRandomNumber() {
		// Generate Random number and add in array list
		Random rand = new Random();
		int max=100,min=50;
		List<Integer> li = new ArrayList<Integer>();
		for (int i=0; i<20; i++) {
			li.add(rand.nextInt(max - min + 1) + min);
		}
		System.out.println("Original List from 'generateRandomNumber' method= "+li+"\n-----*****----\n" );
		// End of random number generation
		return li;
	}
	
	public static List<Integer> square () {
		// Use "map" function
		List<Integer> integer = generateRandomNumber();
		List<Integer> square = integer.stream().map(i -> i*i).collect(Collectors.toList());
//		System.out.println("List of Square from 'square' method= "+square+"\n-----*****----\n");
		return square;
	}
	
	public static List<Integer> sort () {
		List<Integer> integer = generateRandomNumber();
		List<Integer> sorted = integer.stream().sorted().collect(Collectors.toList());
//		System.out.println("Sorted List from 'sort' method= "+sorted+"\n-----*****----\n" );
		return sorted;
	}
	
	public static List<Integer> reversedSort () {
		List<Integer> integer = generateRandomNumber();
		List<Integer> revSort = integer.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println("Reversed Sorted List from 'reversedSort' method= "+revSort+"\n-----*****----\n" );
		return revSort;
	}

	public static void main(String[] args) {
		System.out.println("List of Square in 'main' Method = "+square()+"\n-----*****----\n");
		System.out.println("Sorted order in 'main' Method = "+sort()+"\n-----*****----\n");
		System.out.println("Reversed Sorted order in 'main' Method = "+reversedSort()+"\n-----*****----\n");

	}

}

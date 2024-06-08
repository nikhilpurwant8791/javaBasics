package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class SortingUsingStream {

	public static void main(String[] args) {
		sortStreamInReverseOrder();
	}

	public static void sortStreamInReverseOrder() {
		Random rand = new Random();
		int max=100,min=50;

		List<Integer> li = new ArrayList<Integer>();
		for (int i=0; i<20; i++) {
			li.add(rand.nextInt(max - min + 1) + min);
		}
		System.out.println("\n\n-----*****----\nOriginal List = "+li );

		// Distinct use to give only uniques items. and sorted( sort the int in ascending order)
		System.out.print("\n-----*****----\nAscending order is= ");
		li.stream().distinct().sorted().forEach(s->System.out.print(s+", "));

		// Distinct use to give only uniques items. and sorted( sort the int in descending order)
		System.out.print("\n\n-----*****----\nDescending order is= ");
		li.stream().distinct().sorted(Comparator.reverseOrder()).forEach(s->System.out.print(s+", "));


		int secondhighest = li.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("\n\n-----*****----\nSecond Highest No.= "+secondhighest+"\n");

		//Print multiple of 5
		System.out.print("-----*****----\nMultiple of 5 = ");
		li.stream().filter(i -> i%5 == 0).forEach(s -> System.out.print(s+", "));
	}
}

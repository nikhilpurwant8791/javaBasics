package stream;
import java.util.*;

public class DistinctFunction {

	public static void main(String[] args) {
		distinctStram();
	}

	public static void distinctStram() {
		List<Integer> li = new ArrayList<Integer>();
		for (int i=0; i<10; i++) {
			li.add(i);
		}
		for (int j=5; j<15; j++) {
			li.add(j);
		}
		System.out.println("Original List = "+li);
		// Distinct use to give only uniques items.
		li.stream().distinct().forEach(s->System.out.print(s+", "));
	}
}

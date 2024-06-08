package stream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterUsingStream {
	public static void main(String[] args) {
		dupli();
	}

	public static void dupli () {
		String a = "Find DupliCate Charactetr";
		String e = a.toLowerCase().replace(" ", "");
		char[] b = e.toCharArray();

		// add the char array in list
		List <Character> li = new ArrayList<Character>();
		for (char c:b) {
			li.add(c);
		}
		// Create a map to store the count of each character
		Map<Character, Long> characterCounts = li.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Print the count of each duplicate character
		characterCounts.entrySet().stream().filter(entry -> entry.getValue() > 1)
		.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	}

}

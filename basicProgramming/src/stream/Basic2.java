package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Basic2 {

	public static List<String> fullName() {
		String[] firstNames = {"John", "Emily", "Michael", "Sophia", "William"};
		String[] lastNames = {"Smith", "Johnson", "Brown", "Jones", "Miller"};

		List<String> name = new ArrayList<String>();
		Random random = new Random();
		for (int i=0; i<20; i++) {
			String firstName = firstNames[random.nextInt(firstNames.length)];
			String lastName = lastNames[random.nextInt(lastNames.length)];
			String fullName = firstName + " " + lastName;
			name.add(fullName);
		}
		System.out.println("List of original Names = "+name);
		return name;
	}

	// Use of filter function for string
	public static List<String> filterByName() {
		List<String> name = fullName();
		List<String> li = name.stream().filter(f -> f.startsWith("J")).collect(Collectors.toList());
		return li;
	}

	public static void sortedwithHashMap() {
		List<String> name = fullName();
		//		name.stream().sorted().forEach(s -> System.out.println(s));
		Map <String, Integer> m= new HashMap<String, Integer>();
		for(String s: name) {
			if(m.equals(s)) {
				m.put(s, m.get(s+1));
			}else {
				m.put(s, 1);
			}
		}
		for (String m1 : m.keySet()) {
			System.out.println("'"+m1+"'"+" appears for " + m.get(m1)+" times");
		}
	}

	public static void sortedWithStream() {
		List<String> name = fullName();
		// Map <String, Integer> m, Integer datatype will throw an error.
		Map<String, Long> m = name.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		m.keySet().stream().forEach(s -> System.out.println("'"+s+"'"+" appears for " + m.get(s)+" times"));
	}


	public static void main(String[] args) {
		//		fullName();
		System.out.println("\n\n ******---filterByName----*****\n\n");
		System.out.println(filterByName());
		System.out.println("\n\n ******---sortedwithHashMap---*****\n\n");
		sortedwithHashMap();
		System.out.println("\n\n ******---sortedWithStream---*****\n\n");
		sortedWithStream();

	}
}

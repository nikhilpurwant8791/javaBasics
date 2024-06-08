package common;

import java.util.*;

public class RemoveDuplicateIntUsingCollections {
	static List<Integer> l;

	public static void main (String[] args) {
		removeDupli();
		countAndPrintDupli();
	}

	public static void removeDupli() {
		/*
		 * 1. Create an array of integer with duplicate characters
		 * 2. Use set collection
		 * 3. Use iterator to print the integers
		 */

		l = new ArrayList<Integer>();
		for(int i=0; i<50; i++){
			l.add(i);			
		}
		for(int j=4; j<70; j++) {
			l.add(j);
		}
		for(int i=0; i<10; i++){
			l.add(i);			
		}
		Iterator<Integer> li = l.iterator();
		System.out.print("Original List of Integer= ");
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println("\n------**********--------");
		Set<Integer> s = new HashSet<Integer>();
		s.addAll(l);
		Iterator<Integer> se = s.iterator();
		System.out.print("Sorted List of Integer= ");
		while(se.hasNext()) {
			System.out.print(se.next()+" ");
		}
	}

	public static void countAndPrintDupli() {
		/*
		 * Count all the duplicate character
		 */
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int a:l) {
			if(m.containsKey(a)) {
				m.put(a, m.get(a)+1);
			}else {
				m.put(a, 1);
			}
		}
		for(int b: m.keySet()) {
			if(m.get(b)>1) {
				System.out.println("Integer "+"'"+b+"' appears for "+m.get(b)+" times.");
			}
		}
	}
}

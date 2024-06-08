package common;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterUsingHashmap {
	/* Problem Statement: Identify the duplicate character from the string and print the same with count, don't print the white spaces
	 * ex: JAVA --> Duplicate character- A count 2
	 */
	
	public static void main(String[] args) {
		String a = "Identify the DUPLICATE character";
		useHashmap(a);
	}

	public static void useHashmap (String e) {
		/*
		 * Solution: Use Hashmap
		 */
		// Declare the string.
		System.out.println("Original String is ="+e);

		// convert to lowercase / uppercase (common format)
		String a = e.toLowerCase();
		System.out.println("Convert to lowercase, and String is ="+a);

		char[] b = a.toCharArray();

		// Create Map object
		Map <Character, Integer> m = new HashMap<Character, Integer>();
		//		store the character in hashmap
		//		Inside the for-each loop, run the if condition, like if character present in map(set) then enter in if loop else no
		for (char d: b) {
			if(m.containsKey(d)) {
				m.put(d, m.get(d)+1);
			}else {
				m.put(d, 1);
			}
		}

		System.out.println("KeySet"+m.keySet()+ "\n"); // List the characters present 

		System.out.println("values"+ m.entrySet()+ "\n"); // Shows All characters and its count

		//Print Duplicate character
		//From keyset, we can identify which char appears more than one time
		//Run the for-each loop and use the if condition
		// if white space is present use one more condition in if loop
		System.out.println("-----***********------");
		for (char m1 : m.keySet()) {
			if(m.get(m1)>1 && !Character.isWhitespace(m1)) {
				System.out.println("'"+m1+"'"+" appears for " + m.get(m1)+" times");
			}
		}
	}
}

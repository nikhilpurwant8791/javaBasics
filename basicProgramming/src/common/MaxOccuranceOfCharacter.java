package common;

public class MaxOccuranceOfCharacter {

	public void usingSimpleFor () {
		String a = "maxoccuranceofcharacter";
		int count = 0;
		char[] b = a.toCharArray();
		for (int i=0; i<b.length; i++) {
			if(a.charAt(i) == 'c') {
				count++;
			}
		}
		System.out.println("'c' is occuring in "+"'"+a+"'"+" for "+count+" times");
	}

	public void usingForEach() {
		String a = "maxoccuranceofcharacter";
		int c =0;
		char[] b = a.toCharArray();
		for (char ch:b) {
			if (ch == 'a') {
				c++;
			}
		}
		System.out.println("'a' is occuring in "+"'"+a+"'"+" for "+c+" times");
	}

	public static void main(String[] args) {
		MaxOccuranceOfCharacter m = new MaxOccuranceOfCharacter();
		m.usingSimpleFor();
		m.usingForEach();
	}

}

package common;

public class SpecialCharacter {
	public static void special() {
		String b ="< > , . / ? ; : [ ] { } | ! @ # $ % ^ & * ( ) ";
		String a = "My Name is m@r # $ ^ % & & * *" ;
		//		String[] sp = s.split(" ");
		char[] c = b.toCharArray();
		char[] d = a.toCharArray();
		for (int i = 0; i < d.length-1; i++) {
			for (int j=0; j<=c.length-1; j++) {
				if(d[i] == c[j] && d[i]!= ' ') {
					System.out.println("special Character is "+ c[j]);
				}
			}
		}
	}

	public static void main (String[] args) {
		// check conflict
		special();
	}
}

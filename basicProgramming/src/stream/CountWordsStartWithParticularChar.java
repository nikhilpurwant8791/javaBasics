package stream;

import java.util.*;

public class CountWordsStartWithParticularChar {

	public static void main(String[] args) {
		long startWithM = particularChar();
		System.out.println("Count of words start with 'M' are "+startWithM);

	}
	
	public static long particularChar() {
		List <String> l = new ArrayList<String>();
		l.add("Nikhil");
		l.add("Max");
		l.add("Mayur");
		
		long m = l.stream().filter(s -> s.startsWith("M")).count();
		return m;
		
	}

}

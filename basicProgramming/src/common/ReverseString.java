package common;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

	public static String reverse(String a) {
		List<String> list = new ArrayList<String>();
		String[] b = a.split(" ");
		String re = "";

		for (int c=b.length-1; c >=0; c--) {
			list.add(b[c]);
		}
		for (String s: list) {
			re += s+ " ";
		}
		return re;
	}

	public static void main (String[] args) {
		List<String> a = new ArrayList<String> ();
		a.add("My Name Is Max");
		a.add("Like to play Cricket");
		
		for(String s : a) {
			String rev = reverse(s);
			System.out.println(rev);
		}
	}
}

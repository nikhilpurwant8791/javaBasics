package common;

import java.util.ArrayList;

public class PalindromeString {

	public static boolean isStringPalindrome(String b) {
		String rev ="";
		for(int i=b.length()-1; i>=0; i--) {
			rev = rev +b.charAt(i);
		}
		if(rev.equals(b)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList<String>();
		a.add("MAX");
		a.add("aba");
		a.add("madam");
		a.add("palindrome");
		for (String b: a) {
			String p = isStringPalindrome(b)? " is palindrome String": " is not a palindrome String";
			System.out.println(b+p);
		}
	}
}

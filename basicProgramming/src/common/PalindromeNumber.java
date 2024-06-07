package common;

public class PalindromeNumber {

	public static boolean isPalindrome(int a) {
		int temp = a;
		int rev=0;
		while(a != 0) {
			int b = a%10; //--> 1 --> 2
			rev = rev*10 + b; //--> 1 -->12
			a = a/10; //12 -->0.1
		}
		if(rev == temp) {
			return true;
		}
		return false;
	}

	public static void main (String[] args) {
		int [] a = {121, 454, 12345, 68749, 256897};
		for (int b:a) {
		String p = isPalindrome(b)? " is Palindrome" : " is not Palindrome";
		System.out.println(b+p);
		}
	}


}

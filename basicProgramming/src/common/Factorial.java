package common;

public class Factorial {
	static int c1;
	static int d;
	public static int factorialOfNumber(int d1) {
	d = d1;
		int k= 1;
		for(int j=1; j<=d; j++) {
			k = k*j;
		}
		return k;
	}
	
	public static int whileloop (int c) {
		c1 = c;
		int i = 1;
		int k =1;
		while(i <=c1) {
			k=k * i;
			i++;
		}
	return k;	
	}

	public static void main(String[] args) {
		int a = factorialOfNumber(6);
		System.out.println("Factorial of "+d+" Number using For loop=" + a);
		
		int b = whileloop(5);
		System.out.println("Factorial of "+c1+" using While loop="+b);
	}

}

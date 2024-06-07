package common;

public class MaxNumberInArray {
	
	public static int max() {
		int [] a = {1,50,90,2,8,3,6,100};
		int m = a[0];
		for (int i =0; i< a.length; i++) {
			if(a[i]>m) {
				m = a[i];
			}
		}
		System.out.print("Numbers Present in Array are ");
		for(int b:a) {
			System.out.print(b + " " );
		}
		System.out.println();
		return m;
	}

	public static void main(String[] args) {
		int maximum = max();
		System.out.println("Maximum number from Array is "+maximum);
	}

}

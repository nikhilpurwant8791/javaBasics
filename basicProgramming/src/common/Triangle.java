package common;

public class Triangle {

	public static void main(String[] args) {
		
		System.out.println("--------Right angle triangle----------");
		for(int i=0; i<5; i++)   
		{   
			for(int j=0; j<=i; j++)   
			{   
				System.out.print("* ");   
			}   
			System.out.println(); 
		}

		System.out.println("--------************----------");
		System.out.println("--------Inverted Right angle triangle----------");
		for (int i=0; i<=5; i++) {
			//			System.out.print("*");
			for (int j=5; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("--------************----------");
		System.out.println("--------Left side Right angle triangle----------");
		int row = 5;
		for (int i=0; i<=5; i++) {
			for (int k=0; k<row-i; k++) {
			System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("--------************----------");
		System.out.println("--------Equivalent triangle----------");
		int rc = 5;
		for (int i=0; i<=5; i++) {
			for (int k=0; k<rc-i; k++) {
			System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		
		System.out.println("--------************----------");
		System.out.println("--------Diamond----------");
		int d = 5;
		for (int i=0; i<=5; i++) {
			for (int k=0; k<d-i; k++) {
			System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		for (int i=0; i<=5; i++) {
			for (int j=0; j<=i; j++)  {
			System.out.print(" ");
			}
			for (int k=0; k<=d-1-i; k++) {  
				System.out.print(" *");
			}
			System.out.println("");
		}
		
	}

}

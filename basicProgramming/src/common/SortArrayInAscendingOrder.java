package common;

public class SortArrayInAscendingOrder {
	public static void sorting() {
		int [] a= {1,5,8,9,2,34,56,21};

		System.out.print("List of actual array -->");
		for (int original : a) {
			System.out.print(original + " ");
		}
		System.out.println();

		int temp =0;
		for (int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("-----**********---------");
		System.out.print("Sort the array in ascending order -->");
		for (int asc : a) {
			System.out.print(asc + " ");
		}
	}

	public static void main (String[] args) {
		sorting();
	}

}

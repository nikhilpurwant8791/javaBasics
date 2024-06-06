package starPatterns;

public class EqualityOfArray {
	
	public static void main (String[] args) {
		String equal = isEqual()? "Array is Equal": "Array is Not Equal";
		System.out.println(equal);
	}

	public static boolean isEqual() {
		int a[] = {1,2,3,4,5,6};
		int b[] = {1,2,3,4,5,6};

		if(a.length == b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i]==b[i]) {
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
	}

}

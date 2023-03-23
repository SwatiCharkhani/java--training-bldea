package training_codes;

import java.util.Arrays;

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,20,30,40,50,60,70,80,90};
		int arr2[]= {20,10,50,30,70,40,60,80,90};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(arr1.length==arr2.length) {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]==arr2[i]) {
					System.out.println("arrays are equal");
					System.exit(0);
				}
			}
			System.out.println("arrays are not equal");
		}
		else {
			System.out.println("arrays not equal");
		}
	}

}

package training_codes;

import java.util.Scanner;

public class Code5 {

	
		// TODO Auto-generated method stub
		public static int Linearsearch(int arr[],int key)
		 {
			 for(int i=0;i<arr.length;i++) {
				 if(arr[i]==key) {
					 return(i+1);
					  }
			 }
			 return 0;
		 }
		 public static void main(String args[]) {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter the array element to be searched:");
			 int key=sc.nextInt();
			 int arr[]= {10,30,25,68,40,15,90,78,144,51,54,8};
			 int res=Linearsearch(arr,key);
			 if(res>0) {
				 System.out.println("element found in position" +(res));
				 }
			 else {
				 System.out.println("element not found");
			 }
	}

}

package training_codes;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the age:");
		 int age=sc.nextInt();
		 if(age<18) {
			 System.out.println("you are still minor");
		 }
		 else if(age>65) {
			 System.out.println("you are senoir citizen");
		 }
		 else
		 {
			 System.out.println("Congrajulations! you are most eligible groom");
		 }
	}

}

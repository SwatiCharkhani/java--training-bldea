package training_codes;

import java.util.Scanner;
class Addition1 extends Thread{
	@Override
	public void run() {
		System.out.println("addition operation");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		int num1=sc.nextInt();
		System.out.println("enter num2:");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println(res);
		System.out.println("addition completed");
	}
}
class Printing1 extends Thread{
	@Override
public void run() {
		System.out.println("printing operation");
	
for(int i=1;i<=5;i++) {
	try {
		System.out.println("RCB FOREVER");
		Thread.sleep(2000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	}
System.out.println("Printing completed");
	}
	}
		class Banking1 extends Thread{
			@Override
			public void run() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Banking operation");
				System.out.println("Enter the accno:");
				int accno=sc.nextInt();
				System.out.println("Enter pin");
				int pin=sc.nextInt();
				System.out.println("printing completed");

			}
		}
		public class ThreadEx1 {  
		public static void main(String[] args) {
			System.out.println("main Starting");
			Addition1 ad= new Addition1();
			System.out.println(ad);
			Printing1 pr=new Printing1();
			System.out.println(pr);
			Banking1 bn=new Banking1();
			System.out.println(bn);
			Thread t1=new Thread(ad);
			Thread t2=new Thread(pr);
			Thread t3=new Thread(bn);
			
			t1.start();
			t2.start();
			t3.start();
			System.out.println("main terminated");
		}

	}



package training_codes;
import java.util.Scanner;
public class ExpHdl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numerator:");
	int num= sc.nextInt();
	System.out.println("enter the denominator:");
	int deno=sc.nextInt();
	int res= num/deno;
	System.out.println(res);
}
catch(ArithmeticException e) {
	System.out.println("Arithmetic Exception is generated");
}
	}

}

package training_codes;
import java.util.Scanner;
class Operations{
	void function() throws ArithmeticException{
Scanner sc=new Scanner(System.in);
System.out.println("enter the numerator:");
int num= sc.nextInt();
System.out.println("enter the denominator:");
int deno=sc.nextInt();
int res= num/deno;
System.out.println(res);
	}
}
public class CodeEx {
public static void main(String[] args) {
	try {
		Operations op=new Operations();
		op.function();
	}
		catch(ArithmeticException e) {
			System.out.println("Excetion handled in main Thread");
	}
}
}


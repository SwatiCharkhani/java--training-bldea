package training_codes;

import java.util.Arrays;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    //step-1
	    System.out.println("String-1:");
	    String s1=sc.next();
	    System.out.println("String-2:");
	    String s2=sc.next();
	    //step-2
	    char[] c1=s1.toCharArray();
	    char[] c2=s2.toCharArray();
	    //Step-3
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	    //Step-4
	    if(Arrays.equals(c1,c2)) {
	    	System.out.println("Anagram");
	    	
	    }
	    else {
	    	
	    	System.out.println("Not Anagram");
	    }
	}

}

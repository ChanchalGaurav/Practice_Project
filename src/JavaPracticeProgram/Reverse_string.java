package JavaPracticeProgram;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		
		String str=sc.next();
		
		int len= str.length();   //find out the length of character
		
		System.out.println("string size is "+len);
		
		String rev="";
		
		for(int i=len-1; i>=0; i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println("Reverse string is " +rev);
		

	}

}

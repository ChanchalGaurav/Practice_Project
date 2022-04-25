package JavaPracticeProgram;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");

		String str=sc.next();
		String org_String=str;
		
		int len= str.length();
		
		String rev="";
		
	for(int i=len-1; i>=0; i--)	
	{
		rev= rev+str.charAt(i);
	}
		
		System.out.println("Reverse String" +" "+rev);

	
	if(org_String.equals(rev))
	{
		System.out.println("String is Palindrome");
	}
	else
	{
		System.out.println("String is not Palindrome");
	}
}
}

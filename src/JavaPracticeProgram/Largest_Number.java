package JavaPracticeProgram;

import java.util.Scanner;

public class Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a");
		int a= sc.nextInt();
		
		
		System.out.println("Enter b");
		int b= sc.nextInt();
		
	
		System.out.println("Enter c");
		int c= sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is Largest number");
			
		}
		else if(b>a && b>c)
		{
			System.out.println("B is largest number");
		}
		else if (c>a && c>b)
		{
			System.out.println("C is Largest Number");
		}
		
	}

}

package JavaPracticeProgram;

import java.util.Scanner;

public class Digits_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		
		int num= sc.nextInt();
		int rem=0;
		int sum=0;
		while(num>0)
		{
			
			rem= num%10;
			sum= sum+rem;
			num=num/10;
		}
		
		System.out.println("Sum of Digits is "+sum);
	}

}

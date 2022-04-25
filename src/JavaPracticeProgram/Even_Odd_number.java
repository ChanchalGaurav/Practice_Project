package JavaPracticeProgram;

import java.util.Scanner;

public class Even_Odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		
		int num=sc.nextInt();
		int even=0;
		int odd=0;
		
		while(num>0)
		{
			
			int rem=num%10;   // now number is 1234
			if(rem%2==0)
			{
				even=even+1;
			}
			else
				{
				odd=odd+1;
				}
			num=num/10;     // now it delete 4 from number and consider digits as 123
		}
		
		System.out.println("Even number count is" +even);
		System.out.println("odd number count is" +odd);
		

	}

}

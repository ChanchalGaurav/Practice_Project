package JavaPracticeProgram;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int count=0;
		int num= sc.nextInt();
		
		if(num>1)  // because Prime number start 2
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
				{
					count=count+1;
				}
			}
				
				if(count==2)
				{
					System.out.println("Number is Prime number");
				}
					
				else
				{
					System.out.println("Number is not Prime number");
				}
			
		}
			else
			{
			System.out.println("Its not nautral number");	
			}
			
		}

	}



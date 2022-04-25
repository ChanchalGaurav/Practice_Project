package JavaPracticeProgram;

import java.util.Scanner;

public class Count_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner str=new Scanner(System.in);
		System.out.println("Enter number");
		
		int num= str.nextInt();
		
		int count=0;
		while(num>0)
		{
			num=num/10;
			count=count+1;
			
		}
		System.out.println("Count is "+count);
		

	}

}

package JavaPracticeProgram;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter number");
   
   int num=sc.nextInt();
   int num1=num;
   int rev=0;
  
      while(num>0)
   {
	   rev=rev*10+num%10;
	   num=num/10;
	   
   }
   System.out.println("Reverse String is "+" "+rev);
   
   if(num1==rev)
   {
	   System.out.println("Number is Palindrome number");
   }
   else
   {
	   
	 System.out.println("Number is not Palindrome number");  
   }
   
   
	}

}

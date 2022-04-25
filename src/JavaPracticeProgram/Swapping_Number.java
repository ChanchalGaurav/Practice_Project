package JavaPracticeProgram;

public class Swapping_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10; int b=20;
		System.out.println("Before swapping a and b value "+a+" "+b);
		
		//Logic 1 - Third variable
		int c;
		c=b;
		b=a;
		a=c;
		
		//Logic 2 - Using + and - operator
		
		a=a+b;   //10+20=30
		b=a-b;   //30-20=10
		a=a-b;   //30-10=20
		
		
        //Logic 3 - Using * and / operator
		
		a=a*b;   //10*20=200
		b=a/b;   //200*20=10
		a=a/b;   //200*10=20
		
	System.out.println("After swapping a and b value "+a+" "+b);
		

		
		
	}

}

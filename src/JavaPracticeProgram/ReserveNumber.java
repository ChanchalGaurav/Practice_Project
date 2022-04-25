package JavaPracticeProgram;

import java.util.Scanner;

public class ReserveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc= new Scanner(System.in);  //use to accept value given at the run time
    System.out.println("Enter Number");
    
    int num=sc.nextInt();  //Store value in num vaiable
    
    /* //First way to reserve a number
    
     int rev=0;
    
    while(num!=0)
    {
    	rev=rev*10+num%10;
    	num=num/10;
    }
      
		System.out.println("Reverse string is "+rev);  */
    
    
    /*  //Second way to reverse a number  (By using StringBuffer class)  // fistly change the number in string
    
     StringBuffer st=new StringBuffer(String.valueOf(num));
    StringBuffer rev= st.reverse();
    System.out.println("Reverse string is "+rev);
    */
    
    
    //Third Way (Using StringBuilder class)

    StringBuilder sbl=  new StringBuilder();
    sbl.append(num);
    StringBuilder rev= sbl.reverse();
    System.out.println("Reverse string is "+rev);
    
	}
}



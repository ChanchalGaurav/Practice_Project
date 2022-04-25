package JavaPracticeProgram;

public class Sum_Arrray {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,2,3,4,5};
		int sum=0;
		
		/* for (int i=0; i<=a.length-1; i++)
		{
			sum= sum+a[i];
			
		}
		
		System.out.println("Sum of Array is: "+sum);  */
		
		
		//Enhanced Loop
		
		for(int value:a)
		{
			sum=sum+value;
		}
		
		System.out.println("Sum of Array is: "+sum); 
		
			} 
		
}

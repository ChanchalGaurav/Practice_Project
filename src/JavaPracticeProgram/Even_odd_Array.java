package JavaPracticeProgram;

public class Even_odd_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,9,5};
		
		
		/* for(int i=0; i<=a.length-1; i++)
		{
			
			if(a[i]%2==0)
			{
				System.out.println("even number is" +a[i]);
			}
			else
			{
				System.out.println("odd number is" +a[i]);
			}
						
		}  */
		
		
		
		  for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println("even number is" +value);
			}

			else
			{
				System.out.println("odd number is" +value);
			}
		}	
		

	}

}

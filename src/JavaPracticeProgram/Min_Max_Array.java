package JavaPracticeProgram;

public class Min_Max_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  int a[]={2,3,4,5,1};
  int max=0;
  int min=0;
  
  for(int i=0; i<=a.length-1; i++)
  {
	  
	  if(max<a[i])
	  {
		  max=a[i];
	  }
	  	  
  }
  System.out.println("Max number is "+max);
	
	}

}

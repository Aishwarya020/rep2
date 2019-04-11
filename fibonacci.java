
public class fibonacci {
	
	public static void main(String [] args)
	
	{
	
		int num1=0,num2=1,fibo=0;
	
	System.out.print(num1+" "+num2) ;
	
	
		for (int i=0;i<6;i++)
			
		{
			fibo=num1+num2;
			System.out.print(" "+fibo);
			num1=num2;
			num2=fibo;
			
			
		}
		
		
	}

}

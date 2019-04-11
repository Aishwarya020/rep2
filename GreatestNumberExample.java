
public class GreatestNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10,num2=25,num3=22;
		int great=0;
		if(num1>num2)
		{
			if(num1>num3)
			{
				great=num1;
			}
		}
		if(num2>num1) 
		{
			if(num2>num3)
			{
				great=num2;
			}
		}
		if(num3>num1)
		{
			if(num3>num2)
			{
				great=num3;
			}
		}
		System.out.println("The greatest of the three numbers is:" +great);
	}

}


public class LargestNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10,num2=25,num3=29;
		int largest=num1 > num2 ? ( num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3) ;
		System.out.println("The largest number is :"+largest);

	}

}


public class evenpositioned {
	
	  
	    public static void main(String[] args) {  
	  
	        //Initialize array  
	        int [] arr = new int [] {11, 32, 13, 254, 155,19,23,4,26};  
	  
	        System.out.println("Elements of given array present on even position: ");  
	        //Loop through the array by incrementing value of i by 2  
	        //Here, i will start from 1 as first even positioned element is present at position 1.  
	        for (int i = 0; i < arr.length; i++) {  
	        	
	        	if (arr[i]%2==0)
	            System.out.println(arr[i]);  
	        }  
	    }  
	}  


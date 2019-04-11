
public class equalparts {

	
	    public static void main(String[] args) {  
	          String str = "aaaabbbbcccc";  
	  
	        //Stores the length of the string  
	        int len = str.length();  
	        //n determines the variable that divide the string in 'n' equal parts  
	        int n = 3;  
	        int temp = 0, chars = len/n;  
	        //Stores the array of string  
	        String[] equalStr = new String [n];  // length of equalstr = 3 i.e. 012
	        
	        System.out.println(equalStr.length
	        		);
	        
	        //Check whether a string can be divided into n equal parts  
	        if(len % n != 0) {  
	            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
	        }  
	        else {  
	            for(int i = 0; i < len; i = i+chars) {  
	                //Dividing string in n equal part using substring()  
	                String part = str.substring(i, i+chars);  
	                System.out.println(temp);
	                equalStr[temp] = part;  
	                System.out.println(equalStr[temp]);
	                temp++;  
	                
	                
	                
	            }  
	    System.out.println(n + " equal parts of given string are ");  
	            for(int i = 0; i < equalStr.length; i++) {  
	                System.out.println(equalStr[i]);  
	                }  
	            } 
	        System.out.println(temp);
	        }  
	
	
	
}

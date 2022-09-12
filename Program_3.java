
import java.util.Scanner;

class SubStringNotFoundException extends Exception{
	SubStringNotFoundException(String s){
		super(s);
	}
}

public class Program_3 {
	
	public static void main(String[] args) {
		  int j = 0,i;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the text :");
		  String str = sc.nextLine();
		  
		  System.out.println("Enter the substring :");
	      String substr = sc.nextLine();
	      substr.toLowerCase();
	      int n1 = str.length();
	      int n2 = substr.length();
	      System.out.println("String: " + str);
	      System.out.println("Substring: " + substr);
	      for ( i = 0; i <= n1 - n2; i++) {
	        
	         for (j = 0; j < n2; j++) {
	            if (str.charAt(i + j) != substr.charAt(j))
	               break;
	         }}
	         if (j == n2) {
	            System.out.println("Success : The substring is present in the string at index " + i);
	            return;
	         }
	         else {
	        	 try {
	        		 throw new SubStringNotFoundException("SubString is not present");
	        	 }catch(SubStringNotFoundException s) {
	        		 System.out.println("Error :"+s.getMessage());
	        	 }
	         }
	      
	      
	   }
	}



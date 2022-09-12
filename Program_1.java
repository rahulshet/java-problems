/*
 * Write a Java program to generate and handle any three built-in exceptions and display appropriate
   error messages.
 */
class Program_1 {

	public static void main(String[] args) {
		 try {
	            int a = 30, b = 0;
	            int c = a/b;  // cannot divide by zero
	            System.out.println ("Result = " + c);
	        }
	        catch(ArithmeticException e) {
	        	//Thrown when an exceptional arithmetic condition has occurred. For example, an integer "divide by zero" 
	        	//throws an instance of this class. ArithmeticException objects may be constructed by the virtual machine as if suppression were 
	        	//disabled and/or the stack trace was not writable.
	            System.out.println ("Can't divide a number by 0");
	        }
		 try {
	            String a = null; //null value
	            System.out.println(a.charAt(0));
	        } catch(NullPointerException e) {
	        	//NullPointerException is a runtime exception 
	        	//in Java that occurs when a variable is accessed which is not pointing to any object and refers to nothing or null.
	        	//Since the NullPointerException is a runtime exception, it doesn't need to be caught and handled explicitly in application code.
	            System.out.println("NullPointerException..");
	        }
		 try {
	            String a = "This is like chipping "; // length is 22
	            char c = a.charAt(24); // accessing 25th element
	            System.out.println(c);
	        }
	        catch(StringIndexOutOfBoundsException e) {
	        	//The StringIndexOutOfBoundsException is an unchecked exception in Java that occurs when an attempt is made
	        	//to access the character of a string at an index which is either negative or greater than the length of the string.
	            System.out.println("StringIndexOutOfBoundsException");
	        }
	}

}
 
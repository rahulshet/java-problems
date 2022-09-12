
import java.util.Scanner;

class NegativeNumberNotAllowedExceptin extends Exception{
	NegativeNumberNotAllowedExceptin(String s){
		super(s);
	}
}
class NumberNotPrimeException extends Exception{
	NumberNotPrimeException(String s){
		super(s);
	}
}
public class Program_2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the integer");
	int num  = sc.nextInt();
	boolean isPrime = true;
	int temp;
	if(num < 0) {
		try {
			throw new NegativeNumberNotAllowedExceptin(" negative number cannot be entered");
		}catch(NegativeNumberNotAllowedExceptin ne){
			System.out.println("Error : "+ne.getMessage());
			
		}
	}
	else {
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else {
			try {
				throw new NumberNotPrimeException(" entered number is not prime");
			}catch(NumberNotPrimeException np) {
				System.out.println("Error : "+np.getMessage());
			}
		}
		   
	   
	}
	}
}
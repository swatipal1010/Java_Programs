package revision;
import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int result;
		// Factorial2 obj = new Factorial2();
		result = calcFact(num);  				//Calling static function directly without using obj of this class
		
		//System.out.println("The factorial of "+num+" is: "+result);
		if (result != -1) {
            System.out.println("The factorial of " + num + " is: " + result);
        } else {
            System.out.println("Factorial is undefined for negative numbers.");
        }
    }
	
	static int fact = 1;
	static int calcFact(int n) {
		if(n==0) {
			return fact;
		}
		if(n>=1) {
			fact=fact*n;
			calcFact(n-1);
			return fact;
		}
		return -1;
		
	}
	
}

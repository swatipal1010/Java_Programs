package MyPrep;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number whose factorial you want to calculate: ");
		int n = sc.nextInt();
		
		int result = fact(n);
		System.out.println("Factorial of "+n+" is: "+result);

	}
	
	public static int fact(int a) {
		int fact=1;
		while(a>0) {
			fact = fact*a;
			a--;
		}
		return fact;
	}

}

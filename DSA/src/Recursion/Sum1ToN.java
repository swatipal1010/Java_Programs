package Recursion;
import java.util.Scanner;

public class Sum1ToN {
	
	//Parameterized Recursion
	public static void sumParam(int i, int sum) {
		if(i<1) {
			System.out.println(sum);
			return;
		}
		sumParam(i-1, sum+i);
	}
	
	//Functional Recursion
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}
	
	
	//Parameterized factorial method
	public static void factorialP(int n, int fact) {
		if(n==1) {
			System.out.println(fact);
			return;
		}
		factorialP(n-1, fact*n);
	}
	
	
	//Functional Factorial method
	public static int factorialF(int n) {
		if(n==1) {
			return 1;
		}
		return n*factorialF(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number: ");
		int number = sc.nextInt();
		
		System.out.println("Sum of numbers from 1 to "+number+" is: "+sum(number));
		System.out.print("Sum of numbers from 1 to "+number+" is: ");
		sumParam(number, 0);
		System.out.println(" ");
		
		System.out.print("Factorial of "+number+" is: ");
		factorialP(number, 1);
		
		System.out.print("Factorial of "+number+" is: "+factorialF(number));

	}

}

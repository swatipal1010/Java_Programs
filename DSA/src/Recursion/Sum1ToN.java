package Recursion;
import java.util.Scanner;

public class Sum1ToN {
	
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum(n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the last number: ");
		int number = sc.nextInt();
		
		System.out.println("Sum of numbers from 1 to "+number+" is: "+sum(number));

	}

}

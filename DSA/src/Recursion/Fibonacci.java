package Recursion;
import java.util.Scanner;

public class Fibonacci {

	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}		
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the fibinacci number you want: ");
		int num = sc.nextInt();
		
		System.out.println(num+"th fibonacci number is: "+fibonacci(num));
	}

}

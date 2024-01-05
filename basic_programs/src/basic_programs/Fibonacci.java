package basic_programs;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b= 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("The series will run upto: ");
		int num = sc.nextInt();
		
		
		while(a<=num) {
			System.out.print(a+" + ");
			int fib = a+b;
			a = b;
			b = fib;
			
			
		}

	}

}

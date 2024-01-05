package revision;
import java.util.Scanner;

public class FibonacciArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int n = sc.nextInt();
		
		int fibo[] = new int[n];
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2; i<n; i++) {
			fibo[i] = fibo[i-1]+fibo[i-2];
		}
		
		System.out.println("Fibonacci series upto "+" " +n);
		for(int i : fibo) {
			System.out.print(i+" ");
		}
	}

}

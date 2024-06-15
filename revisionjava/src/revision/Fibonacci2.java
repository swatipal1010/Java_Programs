package revision;
import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms in the fibonacci series: ");
		int num = sc.nextInt();
		
		int a = 0;
		int b = 1;
		
		System.out.print("Series is: ");
		for(int i=0; i<num; i++) {
			System.out.print(a+", ");
			int sum = a+b;
			a = b;
			b = sum;		
		}
		
		

}
}

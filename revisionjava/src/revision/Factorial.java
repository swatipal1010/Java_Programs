package revision;
import java.util.Scanner;

public class Factorial {
	int n;
	/*Factorial(int a){
		n = a;
	} */
	
	public static void main(String[] args) {
		int x;
		System.out.println("Enter the value of x as positive number: ");
		
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		Factorial f1 = new Factorial();
		System.out.println("Factorial of"+" "+ x + " is:"+" "+ f1.fact(x));  //called function using object of the class
	}
	
	public int fact(int k) {
		if(k==1)
			return 1;
		else
			return k*fact(k-1);
	}
}

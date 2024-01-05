package basic_programs;
import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for which you want to find factorial: ");
		int num = sc.nextInt();
		
		if(num<0)
			System.out.println("Factorial is undefined for negative numbers. Please enter a positive integer.");
		else {
		for(int i=num-1; i>=1; i--) {
			num = num*i;
		}
		 System.out.println("Factorial of the number is: "+num);
		}
	}

}

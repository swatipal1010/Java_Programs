package BasicMaths;
import java.util.Scanner;

public class SwapTwoNums {
	
	//Method-1 Swapping two numbers without using a third variable
	public static void swapNums(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("First Number after swapping is "+a+" and second number after swapping is "+b);		
	}
	
	//Method-2 Swapping two numbers using XOR Operation
	public static void swapNums2(int a, int b) {
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("First Number after swapping is "+a+" and second number after swapping is "+b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		System.out.println("Initially the first number is "+a+" and second number is "+b);
		swapNums(a,b);
		
		swapNums2(a,b);

	}

}

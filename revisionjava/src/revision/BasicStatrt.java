package revision;
import java.util.Scanner;

public class BasicStatrt {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 8;
		int num3 = 9;
		int sum = num1+num2+num3;
		System.out.println("The sum of numbers is: "+sum);
		
		System.out.println("Taking input from user");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		
		System.out.print("Enter third number: ");
		int c = sc.nextInt();
		
		int d = a+b+c;
		System.out.println("The sum of entered numbers is: "+d);
		
		System.out.println("Enter an integer value: ");
		boolean b1 = sc.hasNextInt();
		System.out.println(b1);
		
		
	}

}

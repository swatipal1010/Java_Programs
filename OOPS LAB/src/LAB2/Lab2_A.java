package LAB2;
import java.util.Scanner;

public class Lab2_A {
	public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter first number: ");
			Integer num1 = sc.nextInt();
			//System.out.println(num1);
			
			System.out.print("Enter second number: ");
			Integer num2 = sc.nextInt();
			//System.out.println(num2);
					
			System.out.print("Enter third number: ");
			Integer num3 = sc.nextInt();
			//System.out.println(num3);
			
			
			
			if(num1>num2 && num1>num3)
				System.out.println("Num1 is greatest");
			if(num2>num1 && num2>num3)
				System.out.println("Num2 is greatest");
			if(num3>num1 && num3>num2)
				System.out.println("Num3 is greatest");
		}
		
	}


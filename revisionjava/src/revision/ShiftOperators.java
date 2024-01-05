package revision;
import java.util.Scanner;

public class ShiftOperators {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Left-Shift Operator
		System.out.println("Enter a number you want to left shift : ");
		int num = sc.nextInt();
		
		System.out.println("Enter the value to specify the number of positions to left shift the number: ");
		int value = sc.nextInt();
		
		int leftshift = num<<value;
		System.out.println("Number obtained after applying left shifting to " + num + " by "+ value+ " positions: "+leftshift);

		//Right-Shift Operator
		System.out.println("Enter a number you want to right shift: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the value to specify the number of positions to right shift the value : ");
		int value2 = sc.nextInt();
		
		int rightshift = num2>>value2;
		System.out.println("Number obtained after applying right shift to "+ num2 + " by "+ value2+ " positions: "+rightshift);
	}

}

package basic_programs;
import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is a palindrome or not: ");
		int orig = sc.nextInt();
		int sum = 0;

		int temp = orig;
		while(orig>0) {
			int rem = orig%10;
			sum = (sum*10)+rem;
			orig = orig/10;
		}
		
		if(temp==sum) {
			System.out.println(temp+ " is a palindrome number");
		}
		else
			System.out.println(temp+" is not a palindrome number");
	}

}

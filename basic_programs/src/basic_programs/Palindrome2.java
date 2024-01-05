package basic_programs;
import java.util.Scanner;

public class Palindrome2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string/number to be check for palindrome: ");
		String orig = sc.nextLine();
		int len = orig.length();
		String rev = "";
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+orig.charAt(i);
		}
		
		if(orig.equals(rev))
			System.out.println(orig+" is a palindrome number.");
		else
			System.out.println(orig+" is not a palindrome number.");
	}

}

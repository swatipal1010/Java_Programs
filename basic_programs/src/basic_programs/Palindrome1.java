package basic_programs;
import java.util.Scanner;

public class Palindrome1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string/number to check whether it is a palindrome or not: ");
		String orig = sc.nextLine();
		int len = orig.length();
		boolean res = true;
		
		for(int i=0; i<(len/2);i++) {
			if(orig.charAt(i) != orig.charAt(len-1-i)) {
				res = false;
				break;
			}
		}
		System.out.println(orig+" is palindrome: "+res);
	}

}

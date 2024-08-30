package Recursion;
import java.util.Scanner;

public class StringPalindrome {

	public static boolean isPalindrome(String str, int left, int right) {
		if(left>=right) {
			return true;
		}
		else if(str.charAt(left)!=str.charAt(right)) {
			return false;
		}
		return isPalindrome(str, left+1, right-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		boolean result = isPalindrome(str,0,str.length()-1);
		System.out.println("\'"+str+"\'"+" is a palindrome? ");
		System.out.println("Ans: "+result);

	}

}

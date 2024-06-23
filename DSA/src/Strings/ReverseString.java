package Strings;
import java.util.Scanner;

public class ReverseString {

	public static StringBuilder reverse(String str) {
		StringBuilder reverseStr = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr.insert((str.length()-1)-i, str.charAt(i));
		}
		return reverseStr;
	}
	
	//Method-2 Using two pointers
	public static String reverse2(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		for(int i=0; i<sb.length()/2; i++) {
			int front = i;
			int back = sb.length()-1-i;
			
			sb.setCharAt(front, str.charAt(back));
			sb.setCharAt(back, str.charAt(front));	
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string that you want to reverse: ");
		String str = sc.nextLine();
		System.out.println("Reversed string is: "+reverse(str));
		System.out.println("Reversed string is: "+reverse2(str));

	}

}

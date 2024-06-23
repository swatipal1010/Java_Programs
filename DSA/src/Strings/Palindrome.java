package Strings;

import java.util.Scanner;

public class Palindrome {

	public static String isPalindrome(String str) {
		String s = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		StringBuilder sb = new StringBuilder(s);
		
		for(int i=0; i<sb.length()/2; i++) {
			int front = i;
			int back = sb.length()-1-i;
			
			sb.setCharAt(front, s.charAt(back));
			sb.setCharAt(back, s.charAt(front));	
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string that you want to reverse: ");
		String str = sc.nextLine();
		
		String revStr = isPalindrome(str);
		System.out.println("Reversed string returned is: "+revStr);
		
		if(str.equals(str)) {
			System.out.println(str+" is a palindrome.");
		}else {
			System.out.println(str+" is not a palindrome.");
		}
		

	}

}

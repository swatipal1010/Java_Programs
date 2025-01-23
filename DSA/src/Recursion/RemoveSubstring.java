package Recursion;

import java.util.Scanner;

public class RemoveSubstring {
	
	public static String removeSubstr(String str, String subStr) {
		if(str.isEmpty()) {
			return "";
		}
		if(str.startsWith(subStr)) {
			return removeSubstr(str.substring(subStr.length()),subStr);
		}else {
			return str.charAt(0)+removeSubstr(str.substring(1),subStr);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String str = sc.next();
		
		System.out.println("Enter the substring from he string to be removed: ");
		String subStr = sc.next();
		
		String ans = removeSubstr(str, subStr);
		System.out.println("String after removing \'"+subStr+"\' from the string \""+str+"\" is: "+ans);
		
		sc.close();
	}

}

package Strings;

import java.util.Scanner;

public class LastWordLength {
	    public static int lengthOfLastWord(String s) {
	        int len = s.length();
	        int count = 0;

	        for (int i = len - 1; i >= 0; i--) {
	            if (s.charAt(i) == ' ') {
	                if (count > 0) {
	                    break;
	                }
	            } else {
	                count++;
	            }
	        }
	        return count;
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string with words and spaces: ");
		String str = sc.nextLine();
		
		int len = lengthOfLastWord(str);
		System.out.println("Length of last word in the string is: "+len);

	}

}

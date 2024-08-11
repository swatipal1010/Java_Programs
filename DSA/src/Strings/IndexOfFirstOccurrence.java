package Strings;

import java.util.Scanner;

public class IndexOfFirstOccurrence {
	
	//Method - 1
    public static int firstOccur(String first, String second) {
        if (first.length() == 0 || second.length() == 0 || second.length() < first.length()) {
            return -1;
        }

        // Iterate through 'second' string
        for (int i = 0; i <= second.length() - first.length(); i++) {
            // Check if the substring of 'second' starting at 'i' matches 'first'
            int j;
            for (j = 0; j < first.length(); j++) {
                if (second.charAt(i + j) != first.charAt(j)) {
                    break;  // Mismatch found, break the inner loop
                }
            }

            // If 'first' is completely matched
            if (j == first.length()) {
                return i;  // Return the starting index
            }
        }

        return -1;  // If no match found, return -1
    }
    
    //Method-2
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            String substring = haystack.substring(i, i + m);
            if (substring.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String first= sc.nextLine();
        
        System.out.println("Enter the second string: ");
        String second = sc.nextLine();

        int result = firstOccur(first, second);
        if (result != -1) {
            System.out.println("The first occurrence of \"" + first + "\" in \"" + second + "\" is at index " + result);
        } else {
            System.out.println("\"" + first + "\" is not found in \"" + second + "\"");
        }
        
        int result2 = strStr(second, first);
        if(result!=-1) {
        	System.out.println("The first occurrence of \"" + first + "\" in \"" + second + "\" is at index " + result2);
        }else {
            System.out.println("\"" + first + "\" is not found in \"" + second + "\"");
        }
    }
}

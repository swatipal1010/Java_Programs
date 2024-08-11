package Strings;
import java.util.*;
public class Anagram {
	
	//Method-1
	    public static boolean isAnagram(String s, String t) {
	        
	        if (s.length() != t.length()) {
	            return false; // Anagrams must have the same length
	        }
	        
	        // Convert strings to character arrays and sort them
	        char[] sArray = s.toCharArray();
	        char[] tArray = t.toCharArray();
	        Arrays.sort(sArray);
	        Arrays.sort(tArray);
	        
	        // Compare sorted arrays
	        for (int i = 0; i < sArray.length; i++) {
	            if (sArray[i] != tArray[i]) {
	                return false; // If any characters differ, strings are not anagrams
	            }
	        }
	        return true;
	    }
	
	//Method-2
	    public static boolean isAnagram2(String s, String t) {
	        
	        if (s.length() != t.length()) {
	            return false; // Anagrams must have the same length
	        }

	        int[] frequency = new int[26]; // Assuming lowercase English letters

	        for (char c : s.toCharArray()) {
	            frequency[c - 'a']++;
	        }

	        for (char c : t.toCharArray()) {
	            frequency[c - 'a']--;
	        }

	        for (int count : frequency) {
	            if (count != 0) {
	                return false; // If any count is not zero, the strings are not anagrams
	            }
	        }

	        return true;
	    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String first = sc.nextLine();
		
		System.out.println("Enter the second string: ");
		String second = sc.nextLine();
		
		boolean ans = isAnagram(first, second);
		System.out.println("Is second string anagram of first string? "+ans);

	}

}

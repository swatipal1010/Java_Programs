package Strings;
import java.util.*;

public class ReverseVowels {

	 public String reverseVowels(String s) {
	        // Using StringBuilder to modify the string
	        StringBuilder str = new StringBuilder(s);

	        // Set to store vowels
	        HashSet<Character> vowels = new HashSet<>();
	        vowels.add('a');
	        vowels.add('e');
	        vowels.add('i');
	        vowels.add('o');
	        vowels.add('u');
	        vowels.add('A');
	        vowels.add('E');
	        vowels.add('I');
	        vowels.add('O');
	        vowels.add('U');

	        // Two pointers to find vowels from both ends
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            // Move left pointer until a vowel is found
	            while (left < right && !vowels.contains(str.charAt(left))) {
	                left++;
	            }

	            // Move right pointer until a vowel is found
	            while (left < right && !vowels.contains(str.charAt(right))) {
	                right--;
	            }

	            // Swap the vowels
	            if (left < right) {
	                char temp = str.charAt(left);
	                str.setCharAt(left, str.charAt(right));
	                str.setCharAt(right, temp);

	                // Move pointers after swap
	                left++;
	                right--;
	            }
	        }

	        return str.toString();
	    }

	    public static void main(String[] args) {
	        ReverseVowels sol = new ReverseVowels();
	        System.out.println(sol.reverseVowels("hello")); // Output: "holle"
	        System.out.println(sol.reverseVowels("leetcode")); // Output: "leotcede"
	    }

}

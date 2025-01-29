package Recursion;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//LEETCODE 17
public class PhoneNumChars2 {
	
	public static String getCharRange(int digit) {
	    String[] charMap = {
	        "",       
	        "",       
	        "abc",    
	        "def",    
	        "ghi",    
	        "jkl",    
	        "mno",    
	        "pqrs",   
	        "tuv",    
	        "wxyz"    
	    };
	    return charMap[digit];  
	}
	
    public static void solve(String processed, String unprocessed, List<String> ansList){
        if (unprocessed.isEmpty()) {
	        ansList.add(processed);
	        return;
	    }

	    int digit = unprocessed.charAt(0) - '0';
	    if (digit < 2 || digit > 9) {
	        return;
	    }      
	    String letters = getCharRange(digit);
	    for (int i = 0; i < letters.length(); i++) {
	        solve(processed + letters.charAt(i), unprocessed.substring(1), ansList);
	    }
    }
    
    public static List<String> letterCombinations(String digits) {
        List<String> ansList = new ArrayList<>();
        if (digits.isEmpty()) {
            return ansList;
        }
        solve("",digits,ansList);
        return ansList;
    }   
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input number: ");
		String num = sc.next();
		
		letterCombinations(num);
		
		sc.close();

	}

}

package Recursion;
import java.util.Scanner;

public class RemoveCharacter {

	//METHOD 1: Iterative Approach
	public static String removeChar(char ch, String str) {
		StringBuilder ansStr = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			char currentChar = str.charAt(i);
			if(currentChar!=ch) {
				ansStr.append(currentChar);
			}
		}
		return ansStr.toString();
	}
	
	
	//METHOD 2: Recursive Approach
	public static void removeChar2(String str, char ch) {
		StringBuilder ans = new StringBuilder();
		displayAns(str, ch,0, ans);
	}
	//method to display string without the specified character
	public static void displayAns(String str, char ch, int index,StringBuilder ansStr) {
		if(index==str.length()) {
			System.out.println("String after removing \'"+ch+"\' from the string \""+str+"\" is: "+ansStr.toString());
			return;
		}
		if(str.charAt(index)!=ch) {
			ansStr.append(str.charAt(index));
		}
		displayAns(str,ch,index+1,ansStr);
	}
	
	//METHOD 3: Recursive solution
	public static void skipChar(String processedStr, String unprocessedStr, char ch) {
	    if (unprocessedStr.isEmpty()) {
	        System.out.println("String after removing \'" + ch + "\' is: " + processedStr);
	        return;
	    }
	    if (unprocessedStr.charAt(0) == ch) {
	        skipChar(processedStr, unprocessedStr.substring(1), ch);
	    } else {
	        skipChar(processedStr + unprocessedStr.charAt(0), unprocessedStr.substring(1), ch);
	    }
	}
	
	
	//METHOD 4: Recursive solution
	public static String skipChar2(String unprocessedStr, char ch) {
		if(unprocessedStr.isEmpty()) {
			return "";
		}
		if(unprocessedStr.charAt(0)!=ch) {
			return unprocessedStr.charAt(0)+skipChar2(unprocessedStr.substring(1),ch);
		}else {
			return skipChar2(unprocessedStr.substring(1),ch);
		}
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String str = sc.next();
		
		System.out.println("Enter the character from he string to be removed: ");
		char c = sc.next().charAt(0);
		
		String ans = removeChar(c, str);
		if(ans.length()!=0) {
			System.out.println("String after removing \'"+c+"\' from the string \""+str+"\" is: "+ans);
		}else {
			System.out.println("String after removing \'"+c+"\' from the string \""+str+"\" is: NULL");
		}
		
		removeChar2(str,c);
		
		skipChar(" ",str,c);
		
		String ansStr = skipChar2(str,c);
		System.out.println("String after removing \'"+c+"\' from the string \""+str+"\" is: "+ansStr);
		
		
		sc.close();
	}

}

package Recursion;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class StringPermutation {
	
	public static void permute(String inputStr, String outputStr, ArrayList<String> allPermutations) {
		if(inputStr.length()==0) {
			allPermutations.add(outputStr);
			return;
		}
		
		HashSet<Character> charsSet = new HashSet<>();
		for(int i=0; i<inputStr.length(); i++) {
			char current = inputStr.charAt(i);
			if(!charsSet.contains(current)) {
				charsSet.add(current);
				String newOutput = outputStr+current;
				String newInput = inputStr.substring(0,i)+inputStr.substring(i+1,inputStr.length());
				permute(newInput, newOutput, allPermutations);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		ArrayList<String> allPermutations = new ArrayList<>();
				
		System.out.println("All possible permutations of "+str+" are: ");
		permute(str,"",allPermutations);
		System.out.println(allPermutations);

	}

}

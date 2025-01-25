package Recursion;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
	
	//Printing permutations
	public static void permutation(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed+" ");
			return;
		}
		char ch = unprocessed.charAt(0);
		for(int i=0; i<=processed.length();i++) {
			String first = processed.substring(0,i);
			String second = processed.substring(i, processed.length());
			permutation(first+ch+second, unprocessed.substring(1));
		}
		
	}
	
	
	//Returning the list of permutations
	public static List<String> permutationList(String processed, String unprocessed) {
        List<String> result = new ArrayList<>();		//list to store all permutations
        if (unprocessed.isEmpty()) {
            result.add(processed);
            return result;
        }
        char ch = unprocessed.charAt(0);

        // Loop to insert the character 'ch' into every possible position in the processed string
        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);   // Part before position i
            String second = processed.substring(i);     // Part after position i
            result.addAll(permutationList(first + ch + second, unprocessed.substring(1)));
        }
        return result;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		
		System.out.println("Possible permutations of "+str+" are: ");
		permutation("", str);
		
		List<String> list = permutationList("",str);
		System.out.println("Permutations of "+str+" are: "+list);
		
		
		sc.close();

	}

}

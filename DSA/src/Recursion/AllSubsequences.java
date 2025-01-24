package Recursion;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AllSubsequences {

	//Method for printing the subsequences of the String
	public static void subseq(String processed, String unprocessed) {
		if(unprocessed.length()==0) {
			System.out.print(processed+" ");
			return;
		}
		subseq(processed+unprocessed.charAt(0), unprocessed.substring(1));		//Add the considered character
		subseq(processed, unprocessed.substring(1));							//Ignore the considered character
	}
	
	
	//Method to print subsequences of the integer array
	private static void helper(List<Integer> processed, int[] unprocessed, int index, List<List<Integer>> ansList) {
        if (index == unprocessed.length) {
            ansList.add(new ArrayList<>(processed)); 
            return;
        }
        processed.add(unprocessed[index]);
        helper(processed, unprocessed, index + 1, ansList);

        processed.remove(processed.size() - 1);
        helper(processed, unprocessed, index + 1, ansList);
    }

    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> ansList = new ArrayList<>();
        helper(new ArrayList<>(), arr, 0, ansList);
        return ansList;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String str = sc.next();
		
		System.out.println("Subsequences for the string \""+str+"\" are: ");
		subseq("", str);
		
		System.out.println();
		System.out.println("Enter the size of the array whose subsequences you want to find: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		
		List<List<Integer>> ansList = subsets(arr);
		System.out.println("Subsequences of tha array are: "+ansList);
		
		sc.close();

	}

}

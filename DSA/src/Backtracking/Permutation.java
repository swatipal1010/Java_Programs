package Backtracking;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Permutation {
    
    // Swap function to modify character array
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Recursive function to generate permutations
    private static void permute(char[] arr, int index, List<String> ansList) {
        if (index == arr.length) {
            ansList.add(new String(arr)); 						// Convert char[] back to String
            return;
        }

        HashSet<Character> uniqueElem = new HashSet<>(); 		// To avoid duplicate swaps
        
        for (int i = index; i < arr.length; i++) {
            if (!uniqueElem.contains(arr[i])) {
                uniqueElem.add(arr[i]); 						// Mark this character as used at this level
                swap(arr, index, i); 							// Swap to create a new permutation
                permute(arr, index + 1, ansList); 				// Recursive call
                swap(arr, index, i); 							// Backtrack to restore the original order
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        List<String> ansList = new ArrayList<>();
        char[] arr = str.toCharArray();								 // Convert String to mutable char array
        permute(arr, 0, ansList);

        System.out.println("Possible unique permutations of " + str + " are: " + ansList);
        sc.close();
    }
}

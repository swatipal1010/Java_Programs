package Backtracking;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PalindromePartitioning {

    // Function to check if a string is palindromic
    public static boolean isPalindromic(String substr) {
        return substr.equals(new StringBuilder(substr).reverse().toString());
    }

 // Recursive function to find valid palindromic partitions
    public static void validPartitions(String str, List<String> substrPartition, List<List<String>> paths) {
        if (str.length() == 0) {
            paths.add(new ArrayList<>(substrPartition)); 
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String part = str.substring(0, i + 1);
            if (isPalindromic(part)) {
                substrPartition.add(part);
                validPartitions(str.substring(i + 1), substrPartition, paths); 
                substrPartition.remove(substrPartition.size() - 1); 
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        List<List<String>> partitions = new ArrayList<>();
        List<String> substrPartition = new ArrayList<>();

        // Call the recursive function
        validPartitions(str, substrPartition, partitions);

        System.out.println("Valid substring partitions are: " + partitions);
        sc.close();
    }
}

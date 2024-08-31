package BitManipulation;
import java.util.Scanner;
import java.util.ArrayList;

public class ArraySubsequence {

    public static ArrayList<ArrayList<Integer>> subsequence(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = arr.length;
        int subsets = 1 << n; 
        
        for (int i = 0; i < subsets; i++) { 
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) { 
                if ((i & (1 << j)) != 0) { 
                    list.add(arr[j]); 
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        ArrayList<ArrayList<Integer>> result = subsequence(arr);

        System.out.println("All subsets of the array are:");
        for (ArrayList<Integer> subset : result) {
            System.out.println(subset);
        }
        
        sc.close();
    }
}

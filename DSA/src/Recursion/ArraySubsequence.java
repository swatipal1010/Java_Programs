package Recursion;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ArraySubsequence {

    public static void subsequence(int[] arr, List<Integer> list, int index) {
        // Base case: If the index reaches the end of the array
        if(index >= arr.length) {
            System.out.println(list);
            return;
        }
        
        // Include the current element and move to the next index
        list.add(arr[index]);
        subsequence(arr, list, index + 1);
        
        // Exclude the current element and backtrack
        list.remove(list.size() - 1);
        subsequence(arr, list, index + 1);  
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " elements into the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        List<Integer> list = new ArrayList<>();
        subsequence(arr, list, 0);
        sc.close();
    }
}

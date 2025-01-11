package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNums {
    // Method to swap two elements in the array
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    // Method to find all missing numbers
    public static ArrayList<Integer> allMissingNums(int[] arr) {
        ArrayList<Integer> missNums = new ArrayList<>();
        int n = arr.length;
        int i = 0;
        
        // Cyclic sort to place numbers at their correct indices
        while (i < n) {
            int correctIndex = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= n && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        
        // Find all indices where the value is not correct
        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                missNums.add(j + 1); // Add the missing number
            }
        }
        return missNums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        System.out.println("Enter " + N + " numbers into the array in the range 1 to " + N);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array is: " + Arrays.toString(arr));
        ArrayList<Integer> ans = allMissingNums(arr);
        System.out.println("Missing numbers in the array are: " + ans);
        
        sc.close();
    }
}

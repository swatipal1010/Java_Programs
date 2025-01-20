package Recursion;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void swap(int[] arr, int maxIndex, int idx) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[idx];
        arr[idx] = temp;
    }

    public static void selectionSort(int[] arr, int row, int col, int maxIndex) {
        if (row == 0) {
            return; // Base case: sorting is complete
        }

        if (col < row) {
            // Update maxIndex if the current element is larger
            if (arr[col] > arr[maxIndex]) {
                maxIndex = col;
            }
            // Move to the next column
            selectionSort(arr, row, col + 1, maxIndex);
        } else {
            // Swap the largest element found with the last element of the current unsorted part
            swap(arr, maxIndex, row - 1);
            // Start the next pass with a reduced unsorted portion
            selectionSort(arr, row - 1, 0, 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is: " + Arrays.toString(arr));
        selectionSort(arr, size, 0, 0); // Initial call with row=size
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        sc.close();
    }
}

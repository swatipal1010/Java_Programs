package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    // Reverse the array from index `start` to end
    private static void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static int[] nextPermutation(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int index = -1;
        int n = arr.length - 2;
        // Step 1: Find first decreasing element
        while (n >= 0 && arr[n] >= arr[n + 1]) {
            n--;
        }
        index = n;
        // If no such index is found, reverse the array (last permutation case)
        if (index == -1) {
            reverse(arr, 0);
            return arr;
        }
        // Step 2: Find the next greater element to swap with `arr[index]`
        for (int i = arr.length - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, i, index);
                break;
            }
        }
        // Step 3: Reverse the suffix (all elements after `index`)
        reverse(arr, index + 1);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array representing a particular permutation: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(arr));

        System.out.print("Next permutation of " + Arrays.toString(arr) + " is: ");
        int[] ans = nextPermutation(arr);
        System.out.println(Arrays.toString(ans));

        sc.close();
    }
}

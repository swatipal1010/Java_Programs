package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class SortColorsLeetCode {

    // Method to sort the array of 0s, 1s, and 2s
    public int[] sortColors(int[] arr) {
        int start = 0;
        int middle = 0;
        int end = arr.length - 1;

        while (middle <= end) {
            if (arr[middle] == 0) {
                // Swap arr[start] and arr[middle]
                int temp = arr[start];
                arr[start] = arr[middle];
                arr[middle] = temp;
                start++;
                middle++;
            } else if (arr[middle] == 1) {
                middle++;
            } else {
                // Swap arr[middle] and arr[end]
                int temp = arr[end];
                arr[end] = arr[middle];
                arr[middle] = temp;
                end--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        SortColorsLeetCode obj = new SortColorsLeetCode();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in the array are: " + Arrays.toString(arr));
        System.out.println("Elements in the array after sorting: ");
        arr = obj.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}

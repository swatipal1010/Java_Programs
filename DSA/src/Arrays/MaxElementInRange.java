package Arrays;
import java.util.Scanner;

public class MaxElementInRange {

    static int max(int arr[], int start, int end) {
        try {
            if (arr == null) {
                return -1;
            }
            int maxelement = arr[start];
            if (start >= 0 && end <= arr.length && start <= end) {
                for (int i = start; i <= end; i++) {
                    if (arr[i] > maxelement) {
                        maxelement = arr[i];
                    }
                }
                return maxelement;
            } else {
                throw new IndexOutOfBoundsException("Incorrect index value(s) entered.");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in the array are: ");
        for (int x : arr) {
            System.out.println(x);
        }

        System.out.println("Specify the starting index of the range: ");
        int start = sc.nextInt();

        System.out.println("Specify the ending index of the range: ");
        int end = sc.nextInt();

        int maxElement = max(arr, start, end);

        if (maxElement != -1) {
            System.out.println("Elements in the provided range from " + start + " to " + end + " index: ");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            System.out.println("Maximum element in the specified range is: " + maxElement);
        } else {
            System.out.println("Wrong index specification.");
        }
    }
}


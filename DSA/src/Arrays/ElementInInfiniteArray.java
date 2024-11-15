package Arrays;
import java.util.Scanner;

public class ElementInInfiniteArray {

    public static int searchIndex(int[] nums, int target) {
        int start = 0;
        int end = 1;
        
        // Expand the search range exponentially until the target is within range
        while (end < nums.length && target > nums[end]) {
            int newStart = end + 1;
            // Ensure `end` does not exceed the array length
            end = Math.min(nums.length - 1, end + (end - start + 1) * 2);
            start = newStart;
        }
        
        // Binary search within the identified range
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        // Return -1 if the target is not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements that the array will have: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        
        int ans = searchIndex(arr, target);
        if (ans != -1) {
            System.out.println("Target element " + target + " is found at index " + ans);
        } else {
            System.out.println("Target element " + target + " is not present in the array.");
        }
        
        sc.close();
    }
}

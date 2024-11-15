package Arrays;
import java.util.Scanner;
import java.util.Arrays;

class FirstAndLastAppearance {
	//Method-1
    public static int[] firstlast(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        int[] ans = {-1, -1}; // Initialize to -1, indicating not found

        // Using two pointers to find the first and last occurrence
        while (start <= end) {
            // Find the first occurrence from the start
            if (arr[start] == target && ans[0] == -1) {
                ans[0] = start;
            }
            // Find the last occurrence from the end
            if (arr[end] == target && ans[1] == -1) {
                ans[1] = end;
            }
            
            // Break the loop if both occurrences are found
            if (ans[0] != -1 && ans[1] != -1) {
                break;
            }

            // Move the pointers
            if (arr[start] != target) start++;
            if (arr[end] != target) end--;
        }

        return ans;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements the array will have: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " elements in the array in sorted order: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array is: " + Arrays.toString(arr));
        System.out.println("Enter the target element whose first and last appearance you want to know in the array: ");
        int target = sc.nextInt();
        
        int ans[] = firstlast(arr, target);
        if (ans[0] != -1 && ans[1] != -1) {
            System.out.println("First and last appearance of element " + target + " in the array is at index: " + Arrays.toString(ans));
        } else {
            System.out.println("Element " + target + " doesn't exist in the array.");
        }
        
        sc.close();
    }
}

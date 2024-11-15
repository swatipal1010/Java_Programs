package Arrays;
import java.util.Scanner;
import java.util.Arrays;

class FirstAndLastAppearance {
	
	//Method-1 Using Two Pointers
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
    
    
    //Method-2 Using Binary Search
    public static int searchIndex(int[] nums, int target, boolean firstStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) { 
                start = mid + 1;
            } else {
                ans = mid;
                if (firstStartIndex) {
                    end = mid - 1; 
                } else {
                    start = mid + 1; 
                }
            }
        }
        return ans;
    }

    public static int[] searchRange(int[] nums, int target) {
        int ans[] = {-1, -1};
        int index1 = searchIndex(nums, target, true);
        
        if (index1 != -1) {
            int index2 = searchIndex(nums, target, false);
            ans[0] = index1;
            ans[1] = index2;
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
        
        int[] result = searchRange(arr, target);
        System.out.println("First and last occurrence of " + target + ": " + Arrays.toString(result));
        
        sc.close();
    }
}

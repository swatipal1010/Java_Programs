package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MinimumInRotatedArray {
	
	//Method-1: To find the minimum element in rotated array that contains duplicate values using pivot value
	public static int findMin(int arr[]) {
		int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // If duplicates, skip them
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            // Decide direction to search
            else if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
            return -1;
	}
	
	
	//Method-2: To find the minimum value directly in a sorted array(also contains duplicate values) using Binary Search
	public static int findMin2(int[] nums) {
		int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Compare mid with end to decide the search direction
            if (nums[mid] > nums[end]) {
                start = mid + 1; // Minimum lies in the right part
            } else if (nums[mid] < nums[end]) {
                end = mid; // Minimum lies in the left part, including mid
            } else {
                // When nums[mid] == nums[end], skip the duplicate at the end
                end--;
            }
        }

        // At the end of the loop, start == end, pointing to the minimum element
        return nums[start];
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array(Size should be an odd number): ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements in array in sorted order. Array must contain duplicate elements with only one single element.: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is : "+Arrays.toString(arr));
		
		int minVal = findMin(arr);
		System.out.println("Minimum value in the array is: "+arr[minVal+1]);
		
		int minVal2 = findMin2(arr);
		System.out.println("Minimum value in the array is: "+minVal2);
	}

}

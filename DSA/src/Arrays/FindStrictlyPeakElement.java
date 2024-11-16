package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class FindStrictlyPeakElement {
	
	
	//Method-1 Comparing the obtained mid element with its next element (element in the right)
	public static int strictPeakIndex(int[] nums) {
		int start = 0;
        int end = nums.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
	}
	
	//Method-2 Handling the edge cases separately
	public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Check if mid is a peak element by comparing with both neighbors
            boolean leftCheck = (mid == 0 || nums[mid] > nums[mid - 1]);
            boolean rightCheck = (mid == nums.length - 1 || nums[mid] > nums[mid + 1]);

            if (leftCheck && rightCheck) {
                // If both conditions are true, nums[mid] is a peak
                return mid;
            }
            
            // If the left neighbor is greater, move to the left side
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                end = mid - 1;
            } else {
                // Otherwise, move to the right side
                start = mid + 1;
            }
        }
        
        // If no peak is found (though there should always be one), return -1
        return -1;
    }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements the array will have: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " elements in the peak array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: "+Arrays.toString(arr));

        int ans1 = strictPeakIndex(arr);
        System.out.println("Peak element is "+arr[ans1]+" and it lies at index: "+ans1);
        
        int ans2 = findPeakElement(arr);
        System.out.println("Peak element is "+arr[ans2]+" and it lies at index: "+ans2);

	}

}

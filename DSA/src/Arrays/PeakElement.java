package Arrays;
import java.util.Scanner;
import java.util.Arrays;

//Program to find the index of the peak element in the array

public class PeakElement {
	
	//Method-1 Simple Iteration
	public static int peakIndexItr(int[] arr) {
		int start = 0; 
        int next = start+1;

        while(arr[next]>arr[start]){
            start=next;
            next++;
        }
        return start;
	}

	
	//Method-2 Using Binary Search Concept
	public static int peakIndex(int[] nums) {
	    int start = 0;
	    int end = nums.length - 1;

	    while (start < end) {
	        int mid = start + (end - start) / 2;
	        // Check if the middle element is greater than its next element
	        if (nums[mid] > nums[mid + 1]) {
	            // The peak is in the left half, including mid
	            end = mid;
	        } else{
	            // The peak is in the right half, excluding mid
	            start = mid + 1;
	        }
	    }
	    // When start == end, we have found the peak element
	    return start;
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

        int ans = peakIndexItr(arr);
        System.out.println("Peak element is "+arr[ans]+" and it lies at index: "+ans);
        
        int ans2 = peakIndex(arr);
        System.out.println("Peak element is "+arr[ans2]+" and it lies at index: "+ans2);
	}

}

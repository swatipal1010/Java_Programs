package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ElementInRotatedArray {
	
	//STEP:1 Find the Pivot Element
	public static int pivotIndex(int[] nums) {
		int start =0;
		int end = nums.length-1;
		
		while(start<end) {
			int mid = start+(end-start)/2;
			if(nums[mid]>nums[mid+1]) {
				return mid;
			}else if(nums[mid]<nums[mid-1]) {
				return mid-1;
			}else if(nums[mid]<=nums[start]) {				//More larger values lies left of the current mid indexed value of array
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return -1;				//Pivot element is not found. In case where the sorted element is not rotated
	}
	
	
	//Step2: Make use of pivot element to find the target element in the two ascending sorted arrays present in left and right of pivot element
	public static int targetElement(int[] nums,int target) {
		int pivotIdx = pivotIndex(nums);
		if(pivotIdx==-1) {					//Sorted array isn't been rotated, so apply simple binary search to find the element
			return binarySearch(nums, 0, nums.length-1, target);			
		}
		else if(nums[pivotIdx]==target) {
			return pivotIdx;
		}else if(target>=nums[0]) {
			return binarySearch(nums,0,pivotIdx-1, target);
		}else if(target<nums[0]) {
			return binarySearch(nums, pivotIdx+1, nums.length-1, target);
		}	
		return -1;			//In case target element doesn't lies within array
	}
	
	
	//Binary Search to find the element within the provided range
	public static int binarySearch(int nums[], int start, int end, int target) {
		while(start<end) {
			int mid = start+(end-start)/2;
			if(nums[mid]==target) {
				return mid;
			}else if(nums[mid]<nums[target]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;				//In case, target element doesn't lies within the array
	}

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements the array will have: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " elements in the rotated array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: "+Arrays.toString(arr));
        
        System.out.println("Enter the t3"
        		+ "arget element from the array: ");
        int target = sc.nextInt();
        
        int ans = targetElement(arr, target);
        System.out.println("Target element "+target+" lies at index: "+ans);

	}

}

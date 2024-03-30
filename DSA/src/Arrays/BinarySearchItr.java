package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchItr {

	static int binarySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			int mid = start +(end-start)/2;
			if (arr[mid] == target) {
	            return mid;
	        } else {
	        	if (arr[mid] < target) {
	        		start = mid + 1;
	        	}
	        	else {
		            end = mid - 1;
		        }
	       } 
		}
		return -1;					//If element not found, index = -1 is returned
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {2,4,8,11,15,21,52};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the target value: ");
		int target = sc.nextInt();
		
		int index = binarySearch(arr, target);
		
		if(index!=-1)
			System.out.println(target+" lies at index: "+index);
		else
			System.out.println("Element not found in the array.");
	}

}

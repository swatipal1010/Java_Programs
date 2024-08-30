package Recursion;
import java.util.Scanner;
import java.util.Arrays;

public class ReverseArray {
	
	// Method-1: Reverse the array using recursion with swapping elements from both ends
	public static void reverseArray(int[] nums, int i) {
		if(i >= nums.length / 2) {  // Base condition: If index reaches the middle of the array
			return;
		}
		int temp = nums[i];
		nums[i] = nums[nums.length - 1 - i];
		nums[nums.length - 1 - i] = temp;
		reverseArray(nums, i + 1);  // Recursive call with next index
	}
	
	// Method-2: Helper method to swap two elements in the array
	public static void swap(int[] arr, int left, int right) {
		arr[left] = arr[left] + arr[right];
		arr[right] = arr[left] - arr[right];
		arr[left] = arr[left] - arr[right];		
	}
	// Method-2: Reverse the array using recursion and the swap method
	public static void reverseArr(int[] arr, int left, int right) {
		if(left >= right) {  
			return;
		}
		swap(arr, left, right);  
		reverseArr(arr, left + 1, right - 1);  
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter " + size + " elements in the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Call Method-1 to reverse the array
		reverseArray(arr, 0);
		System.out.println("Reversed array using Method-1 is: " + Arrays.toString(arr));
		
		// Call Method-2 to reverse the array back to the original
		reverseArr(arr, 0, size - 1);
		System.out.println("Reversed back array using Method-2 is: " + Arrays.toString(arr));
		sc.close();
	}
}

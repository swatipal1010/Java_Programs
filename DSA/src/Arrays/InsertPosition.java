package Arrays;

import java.util.Scanner;

public class InsertPosition {

	public static int insertIndex(int[]nums, int target) {
		int low = 0, high = nums.length - 1;

        while (low <= high) { 
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add into the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the target element: ");
		int target = sc.nextInt();
		
		int ans = insertIndex(arr, target);
		System.out.println("Index os the target is : "+ans);

	}

}

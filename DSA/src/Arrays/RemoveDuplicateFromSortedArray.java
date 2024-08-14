package Arrays;

import java.util.Scanner;

public class RemoveDuplicateFromSortedArray {
	
	public static int removeDuplicate(int nums[]) {
		int k =0;			//k is the pointer that points to the last unique element of the array
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				nums[k+1]=nums[i+1];
				k++;
			}
		}
		return k+1;		//Returning the count of all unique elements present in the array
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements in the array in sorted order: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Number of unique elements in the array are: "+removeDuplicate(arr));
	}

}

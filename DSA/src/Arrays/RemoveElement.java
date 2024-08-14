package Arrays;

import java.util.Scanner;

public class RemoveElement {
	//Method-1 (Using two pointers)
	public static int removeElem(int nums[], int val) {
		int low = 0;
		int high = nums.length-1;
		while(low<=high) {
			if(nums[low]==val) {
				nums[low]=nums[high];
				high--;
			}else {
				low++;
			}
		}
		return low;
	}
	
	//Method-2
	public static int removeVal(int nums[], int val) {
		int k=0;				//k is a pointer to place the next non-val element in the array
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=val) {
				nums[k]=nums[i];
				k++;
			}
		}
		return k;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elments to be stored in the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the value to be removed from the array: ");
		int val = sc.nextInt();
		
		System.out.println("(Using method-1) Number of elements in the array without having "+val+ " are: "+removeElem(arr, val));
		//System.out.println("(Using method-2) Number of elements in the array without having "+val+ " are: "+removeVal(arr, val));
		
	}

}

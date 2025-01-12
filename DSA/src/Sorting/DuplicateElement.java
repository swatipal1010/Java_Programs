package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement {

	//METHOD:1 Using Cyclic Sort
	public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int findDuplicate(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]!=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=j+1){
                return nums[j];
            }
        }
        return -1;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array(Range: 1 to "+(n-1)+"). Remember to add duplicate element in the array!!");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array is: "+Arrays.toString(arr));
		System.out.println("Duplicate element from the array is: "+findDuplicate(arr));
		sc.close();
	}

}

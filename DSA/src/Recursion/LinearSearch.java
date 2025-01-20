package Recursion;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	//Returning boolean status for presence or absence of the target element in the array
	public static boolean checkTarget(int[] arr, int target, int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index]==target || checkTarget(arr, target, index+1);
	}
	
	//Returning index of the target element
	public static int targetIndex(int[] arr, int target, int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
		return targetIndex(arr, target, index+1);
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		System.out.println("Enter the target element: ");
		int target = sc.nextInt();
		
		if(checkTarget(arr,target,0)) {
			System.out.println(target+" is present in the array at index: "+targetIndex(arr,target,0));
		}else {
			System.out.println(target+ " is not present in the array.");
		}
		sc.close();

	}

}

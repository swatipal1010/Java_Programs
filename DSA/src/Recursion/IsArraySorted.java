package Recursion;
import java.util.Arrays;
import java.util.Scanner;

public class IsArraySorted {
	
	public static boolean isArraySorted(int[] arr, int index) {
		if(index==arr.length-1) {
			return true;
		}
		return arr[index]<arr[index+1] && isArraySorted(arr, index+1);
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
		
		if(isArraySorted(arr,0)) {
			System.out.println("Array is sorted.");
		}else {
			System.out.println("Array is not sorted.");
		}
		sc.close();
	}

}

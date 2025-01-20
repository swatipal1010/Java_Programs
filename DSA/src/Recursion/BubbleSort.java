package Recursion;
import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void swap(int[] arr, int index) {
		int temp = arr[index];
		arr[index]= arr[index+1];
		arr[index+1] = temp;
	}
	public static void bubbleSort(int[] arr, int row, int col) {
		if(row==0) {
			return;
		}
		if(col<row) {
			if(arr[col]>arr[col+1]) {
				swap(arr,col);
			}
			bubbleSort(arr,row,col+1);
		}else {
			bubbleSort(arr,row-1,0);
		}
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
		bubbleSort(arr,size-1,0);
		System.out.println("Array after sorting: "+Arrays.toString(arr));
		sc.close();
	}

}

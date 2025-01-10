package Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	public static int maxIndex(int[] arr,int start, int lastIndex) {
		int max = start;
		for(int i=start; i<=lastIndex; i++) {
			if(arr[i]>arr[max]) {
				max = i;
			}
		}
		return max;
	}
	
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			int lastIndex = n-i-1;
			int maxValIndex = maxIndex(arr,0,lastIndex);
			swap(arr, maxValIndex, lastIndex);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array is: "+Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Sorted array is: "+Arrays.toString(arr));
		sc.close();

	}

}

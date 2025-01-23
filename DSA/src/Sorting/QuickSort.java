package Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	
	public static void quickSort(int[] arr, int low, int high) {
		if(low>=high) {
			return;
		}
		int mid = (low+high)/2;
		int pivotElement = arr[mid];
		
		int start = low;
		int end = high;
		
		while (start <= end) {
		    while (arr[start] < pivotElement) {
		        start++;
		    }
		    while (arr[end] > pivotElement) {
		        end--;
		    }
		    if (start <= end) {
		        int temp = arr[start];
		        arr[start] = arr[end];
		        arr[end] = temp;
		        start++;
		        end--;
		    }
		}

		quickSort(arr,low,end);
		quickSort(arr,start,high);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array is: " + Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        
        System.out.println("Sorted array is: "+Arrays.toString(arr));
        
        sc.close();
	}

}


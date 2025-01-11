package Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
	
	public static void swap(int[] arr, int correct, int i) {
		int temp = arr[correct];
		arr[correct] = arr[i];
		arr[i] = temp;
	}
	
	public static void cyclicSort(int[] arr) {
		int i = 0;
		while(i<arr.length) {
			int correct = arr[i]-1;			//for a value at index i, it's correct index is at arr[i]-1
			if(arr[correct]!=arr[i]) {		//If the value is not at it's correct index
				swap(arr,correct, i);
			}else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements in the array (NOTE: Array elements should be in the range 1-N): ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array is: " + Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
        sc.close();
	}

}

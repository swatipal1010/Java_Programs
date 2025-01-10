package Sorting;
import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int arr[]) {
		if(arr.length==1) {
			return;
		}
		
		boolean swap; 							//Flag to check if in a particular pass array elements are swapped or not
		
		//Run external loop to execute (n-1) steps (Because when all (n-1) gets sorted, the smallest element itself falls to index 0)
		for(int i=0; i<arr.length-1; i++) {
			swap = false; 						//If at particular pass i, no swap occurs, this flag remains false indicating array is sorted
			//Run internal loop < (n-i) times because at each i, i values gets sorted which can be excluded for sorting at particular 'i'
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j]= temp;
					swap = true;
				}
			}
			if(swap==false) {				//If no swap occurs for particular pass, break out of external loop bcz array is sorted
				break;
			}
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
		bubbleSort(arr);
		System.out.println("Sorted array is: "+Arrays.toString(arr));
		sc.close();
	}

}

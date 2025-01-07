package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class InversionCount {
	
	//METHOD 1: Naive Approach
	public static int inversionCount(int[] arr) {
		int count = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	//METHOD 2: OPTIMIZED APPROACH -> Using Merge Sort
	public static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left, inversions = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                inversions += (mid + 1) - (left + i); 						// Count inversions
            }
        }

        // Copy remaining elements
        while (i < leftArr.length) arr[k++] = leftArr[i++];
        while (j < rightArr.length) arr[k++] = rightArr[j++];

        return inversions;
    }

    public static int mergeSortAndCount(int[] arr, int left, int right) {
        if (left >= right) return 0;

        int mid = left + (right - left) / 2;

        int inversions = mergeSortAndCount(arr, left, mid);
        inversions += mergeSortAndCount(arr, mid + 1, right);
        inversions += mergeAndCount(arr, left, mid, right);

        return inversions;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements into the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array is: "+Arrays.toString(arr));
		
		int count = inversionCount(arr);
		System.out.println("Number of inversions in the array are: "+count);
		
		int count2 = mergeSortAndCount(arr, 0, arr.length - 1);
		System.out.println("Number of inversions in the array are: "+count2);
	}

}

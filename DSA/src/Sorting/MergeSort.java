package Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	
	//METHOD 1
	public static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int mid = arr.length/2;
		int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
		return merge(left,right);
	}
	//Function to merge the two sorted halves
	private static int[] merge(int[] first, int[] second) {
		int result[] = new int[first.length+second.length];		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				result[k++] = first[i++];
			}else {
				result[k++]= second[j++];
			}
		}
		
		//If any one of the array isn't traversed fully, it's remaining elements are copied to the result array
		while(i<first.length) {
			result[k++] = first[i++];
		}
		while(j<second.length) {
			result[k++] = second[j++];
		}
		return result;		
	}
	
	//METHOD 2
	//Dividing the array into parts by breaking it down to two halves at each recursive call
	public static void divide(int[] arr, int start, int end) {
		if(start>=end) {
			return;
		}
		int mid = start+(end-start)/2;
		divide(arr,start,mid);
		divide(arr,mid+1,end);
		merge(arr,start,end,mid);
	}
	//Method to merge the sorted halves together to give single sorted array
	private static void merge(int[] arr, int start, int end, int mid) {
		int[] resultArr = new int[end-start+1];
		int i = start;
		int j= mid+1;
		int k = 0;
		
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				resultArr[k++] = arr[i++];
			}else {
				resultArr[k++] = arr[j++];
			}
		}
		while(i<=mid) {
			resultArr[k++]=arr[i++];
		}
		while(j<=end) {
			resultArr[k++] = arr[j++];
		}
		
		for(int l=0; l<resultArr.length; l++) {
			arr[start+l] = resultArr[l];
		}		
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
        
//        int[] resultArr = mergeSort(arr);
//        System.out.println("Sorted array is: "+Arrays.toString(resultArr));
        
        divide(arr,0,arr.length-1);
        System.out.println("Sorted array is: "+Arrays.toString(arr));
        
        sc.close();

	}

}


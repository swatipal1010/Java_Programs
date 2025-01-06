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

	}

}

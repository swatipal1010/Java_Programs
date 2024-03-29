package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MaxElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the "+size+" values in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Values in the array are: "+Arrays.toString(arr));
		
		System.out.print("Maximum value in the array is: ");
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.print(max);

	}

}

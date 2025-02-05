package Recursion;
import java.util.Arrays;
import java.util.Scanner;

public class MaxElementInArray {
	
	public static int maxElement(int[] arr, int index) {
		if(index==arr.length-1) {
			return arr[index];
		}
		int element = maxElement(arr,index+1);
		return arr[index]>element?arr[index]:element;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		int ans = maxElement(arr,0);
		System.out.println("Maximum element in the array is: "+ans);
		

	}

}

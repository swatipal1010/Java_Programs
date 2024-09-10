package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class RotateByK {
	
	public static void rotateArray(int[] arr, int k) {
		int len = arr.length;
		
		for(int i=0; i<k; i++) {
			int temp = arr[len-1];
			for(int j=len-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
	}
	
	
	public static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void rotateArr(int[] arr, int k) {
		int n = arr.length;
		k = k%n;
		int start = 0;
		int end = n-1;
		for(int i=0; i<k; i++) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		end = n-1;
		reverse(arr,start,end);
		
		start = 0;
		end = k-1;
		reverse(arr,start,end);		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		
		System.out.println("Enter the value upto which elements in the array should get shifted to the right: ");
		int k = sc.nextInt();
		
		rotateArr(arr,k);
		System.out.println("Array elements after "+k+" shifts to the right: "+Arrays.toString(arr));

	}

}

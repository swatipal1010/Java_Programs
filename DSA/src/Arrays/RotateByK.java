package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class RotateByK {
	//Method-1 (Takes too long if the input is very large)
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
	
	
	//Method-2 (Runs Optimally)
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
		
		//Reverse entire array
		reverse(arr,0,n-1);
		
		//Reverse first k elements
		reverse(arr,0,k-1);
		
		//Reverse remaining elements (n-k elements)
		reverse(arr,k,n-1);
			
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

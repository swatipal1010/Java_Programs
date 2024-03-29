package Arrays;
import java.util.*;

public class SwapElements {
	
	static void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the "+size+" values in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Values in the array before swapping are: "+Arrays.toString(arr));
		
		System.out.println("Enter the value of the first index whose value you want to swap: ");
		int index1 = sc.nextInt();
		
		System.out.println("Enter the value of the second index whose value you want to swap: ");
		int index2 = sc.nextInt();
		
		swap(arr, index1, index2);
		
		System.out.println("Values in the array after swapping: "+Arrays.toString(arr));
		
		

	}

}

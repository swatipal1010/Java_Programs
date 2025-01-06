package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class SortArrayInWaveForm {
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;	
	}
	public static void waveSort(int[] nums) {
		//We only adjust the elements at the even index, odd index elements will be automatically taken care
		//We ensure that element at even index is greater than it's left and right elements
		for(int i=0; i<nums.length; i+=2) {
			if(i>0 && nums[i]<nums[i-1]) {
				swap(nums, i-1, i);
			}
			if(i< nums.length-1 && nums[i]<nums[i+1]) {
				swap(nums, i, i+1);
			}
		}
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
		waveSort(arr);
		System.out.println("Array after wave sorting: "+Arrays.toString(arr));
	}

}

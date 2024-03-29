package Arrays;

import java.util.Scanner;

//Reversing the array using two-pointers (start and end) method
public class ReverseArray2 {
	static void swap(int arr[], int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	static void reverse(int arr[]) {
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			swap(arr, start, end);
			start++; end--;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in the array before reversing are: ");
        for (int x : arr) {
            System.out.println(x);
        }
        
        reverse(arr);
        
        System.out.println("Elements in the array after reversing are: ");
        for (int x : arr) {
            System.out.println(x);
        }
        

	}

}

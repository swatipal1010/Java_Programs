package Recursion;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PermutationInIntegerArray {
	
	private static void permutation(int[] arr, int index, List<List<Integer>> result) {
        if (index == arr.length) {
            List<Integer> current = new ArrayList<>();
            for (int num : arr) {
                current.add(num);
            }
            result.add(current);
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i); 
            permutation(arr, index + 1, result); 
            swap(arr, index, i); 
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static List<List<Integer>> permutation(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(arr, 0, result); // Start with index 0
        return result;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		
		List<List<Integer>> ans = permutation(arr);
		System.out.println("Permutation of "+Arrays.toString(arr)+" are: "+ans);
		
		sc.close();

	}

}

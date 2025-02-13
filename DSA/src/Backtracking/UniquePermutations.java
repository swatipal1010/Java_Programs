package Backtracking;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

public class UniquePermutations {

	private static void permutation(int[] arr, int index, List<List<Integer>> result) {
        if (index == arr.length) {
            List<Integer> current = new ArrayList<>();
            for (int num : arr) {
                current.add(num);
            }
            result.add(current);
            return;
        }
        HashSet<Integer> elementSet = new HashSet<>();
        for (int i = index; i < arr.length; i++) {
            if (!elementSet.contains(arr[i])) {
                elementSet.add(arr[i]);
                swap(arr, index, i);
                permutation(arr, index + 1, result);
                swap(arr, index, i); 
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Array is: "+Arrays.toString(arr));
		
		List<List<Integer>> ansList = new ArrayList<>();
        permutation(arr, 0, ansList);
        
        System.out.println("All the uniue permutations are: "+ansList);
		
	}

}

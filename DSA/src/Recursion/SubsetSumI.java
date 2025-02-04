package Recursion;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SubsetSumI {
	
	public static List<Integer> subsetSum(int[] arr) {
		List<Integer> ansList = new ArrayList<>();
		helper(arr,ansList,0,0);
		Collections.sort(ansList);
		return ansList;
	}
	private static void helper(int[] arr, List<Integer> ansList, int index, int currSum) {
		if(index==arr.length) {
			ansList.add(currSum);
			return;
		}
		helper(arr,ansList,index+1,currSum+arr[index]);
		helper(arr,ansList,index+1,currSum);
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
		
		System.out.println("Elements in the array are: "+Arrays.toString(arr));
		List<Integer> sumList = subsetSum(arr);
		System.out.println("Sum of digits of subsets of the array are: "+sumList);

	}

}

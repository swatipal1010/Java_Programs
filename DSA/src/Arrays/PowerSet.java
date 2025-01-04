package Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class PowerSet {
	public static ArrayList<ArrayList<Integer>> subSets(int[] arr){
		ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
		int n = arr.length;
		
		for(int i=0; i<Math.pow(2,n); i++) {
			ArrayList<Integer> subset = new ArrayList<>();
			for(int j=0; j<n; j++) {
				if((i&(1<<j))!=0) {
					subset.add(arr[j]);
				}
			}
			subsets.add(subset);
		}
		return subsets;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter "+size+" elements in the array: ");
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		
		ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
		ansList = subSets(arr);
		System.out.println("Subarrays of the array are: ");
		for(ArrayList<Integer> subset: ansList) {
			System.out.println(subset);
		}
	}

}

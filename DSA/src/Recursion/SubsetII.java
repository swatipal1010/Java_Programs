package Recursion;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class SubsetII {
	
	public static List<List<Integer>> subsets(int[] arr){
		List<List<Integer>> ansList = new ArrayList<>();
		Arrays.sort(arr);
		helper(arr,0,ansList,new ArrayList<Integer>());
		return ansList;
	}
	
	public static void helper(int arr[], int index, List<List<Integer>> ansList, List<Integer> list) {
		ansList.add(new ArrayList<>(list));			//Add unique subset formed so far
		for(int i=index; i<arr.length; i++) {
			if(i!=index && arr[i]==arr[i-1]) {
				continue;
			}
			list.add(arr[i]);
			helper(arr,i+1,ansList,list);
			list.remove(list.size()-1);
		}		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " elements into the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: "+Arrays.toString(arr));
        List<List<Integer>> ansList = subsets(arr);
        System.out.println("All unique possible subsets are: "+ansList);
        
        sc.close();
        }

}

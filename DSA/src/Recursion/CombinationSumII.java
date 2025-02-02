package Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class CombinationSumII {
	
	public static List<List<Integer>> combinationSum(int arr[], int target){
		List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(arr); 
        findCombinations(arr, target, 0, ansList, new ArrayList<>());
        return ansList;
	}
	
	private static void findCombinations(int[] arr, int target, int index, List<List<Integer>> ansList, ArrayList<Integer> combination) {
        if (target == 0) {
            ansList.add(new ArrayList<>(combination)); 
            return;
        }
        
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] > target) { 
                break;
            }
            
            combination.add(arr[i]);
            findCombinations(arr, target - arr[i], i + 1, ansList, combination); 
            combination.remove(combination.size() - 1); 
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
        System.out.println("Enter the value of sum that should be equal to the sum of digits in subset: ");
        int target = sc.nextInt();
        
        List<List<Integer>> ansList = combinationSum(arr,target);
        System.out.println("Subsets having sum of digits as "+target+" are: "+ansList);
        
       sc.close();

	}

}

package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class SubsetDuplicateElement {

	public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();					//Creates the outer list that will store all subsets (initially empty).
        outer.add(new ArrayList<>());									//Adds an empty subset ([]) to the outer list
        
        Arrays.sort(arr);
        
        int start = 0;
        int end = 0;
        
        for(int i=0; i<arr.length; i++){
        	start =0;
        	if(i>0 && arr[i]==arr[i-1]) {
        		start = end+1;					//If duplicate element is found, we start copying from start(end+1), else start 0 and copy considered element from first subset at start=0
        	}
        	end = outer.size()-1;				//end points to last subset stored in 'outer' list
        	
            int n = outer.size();
            for(int j=start; j<n; j++){			//Start copying from start to size of 'outer' list
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array whose subsequences you want to find: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		
		List<List<Integer>> ansList = subsets(arr);
		System.out.println("Subsequences of tha array are: "+ansList);
		
		sc.close();

	}

}

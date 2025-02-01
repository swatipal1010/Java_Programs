package Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OneSubsetSumEqualsK {
	public static boolean subsequence(int arr[],List<Integer> list,int index, int sum,int currentSum) {
		if(index==arr.length) {
			if(currentSum==sum) {
				System.out.println("Subset whose sum of digits is equal to "+sum+" is: "+list);
				return true;
			}
			return false;
		}
		//Pick array element
		list.add(arr[index]);
		if(subsequence(arr,list,index+1,sum,currentSum+arr[index])==true) {
			return true;
		};		
		//Don't pick array element
		currentSum-=arr[index];
		list.remove(list.size() - 1);
		if(subsequence(arr,list,index+1,sum,currentSum+arr[index])==true) {
			return true;
		}
		return false;
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
        int sum = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        boolean containsSubset = subsequence(arr, list, 0,sum,0);
        
        if(!containsSubset) {
        	System.out.println("Array doesn't contains subet whose sum of digits is equal to the given sum.");
        }
        sc.close();
	}

}

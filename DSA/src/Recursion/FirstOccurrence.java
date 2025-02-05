package Recursion;
import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurrence {
	
	//Method to find the first index of occurrence of the target element in the array
	public static int firstOccurrence(int[] arr, int index,int target) {
		if(index==arr.length) {
			return -1;
		}
		int indexAns = firstOccurrence(arr,index+1,target);
		if(arr[index]==target) {
			return index;
		}else {
			return indexAns;
		}
	}
	
	
	//Method to find the index of last occurrence of the target element in the array
	public static int lastOccurrence(int[] arr, int index, int target) {
	    if (index == -1) {
	        return -1;  
	    }
	    
	    if (arr[index] == target) {
	        return index;  
	    }
	    return lastOccurrence(arr, index - 1, target);  
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		
		System.out.println("Elemet the lement of the array whose first occurrence index you want to find: ");
		int target= sc.nextInt();
		
		int ans = firstOccurrence(arr,0,target);
		if(ans!=-1) {
			System.out.println("Index of first occurrence of the target element \'"+target+"\' in the array is: "+ans);
		}else {
			System.out.println("Array doesn't contains the target element \'"+target+"\'");
		}
		
		int lastIndex = lastOccurrence(arr,arr.length-1,target);
		if(lastIndex!=-1) {
			System.out.println("Index of last occurrence of the target element \'"+target+"\' in the array is: "+lastIndex);
		}else {
			System.out.println("Array doesn't contains the target element \'"+target+"\'");
		}
		
		sc.close();

	}

}

package Arrays;
import java.util.Scanner;
import java.util.Arrays;

//Given an array of numbers, find the ceiling value of the target element
/*  Step1: If the array is not sorted, sort it first
	Step2: Check whether the sorted array is in ascending or descending order -> Agnostic Binary Search
	Step3: Find the target element index using Binary search
	Step4: If the array is ascending sorted, ceiling value of the target value is at arr[index+1]
	Step5: If the array is descending sorted, ceiling value of the target value is at arr[index-1]
*/

public class NextGreatestNumber {

	static int binarySearchAgn(int arr[], int target) {
		int start =0;
		int end = arr.length-1;
		
		boolean isAsc = arr[0]<arr[arr.length-1];
		
		if(isAsc) {
			while(start<=end) {
				int mid = start+(end-start)/2;
				if (arr[mid] == target) {
		            return mid;
		        } else {
		        	if (arr[mid] < target) {
		        		start = mid + 1;
		        	}
		        	else {
			            end = mid - 1;
			        }
		       } 
			}
			
		}
		else {
			while(start<=end) {
				int mid = start+(end-start)/2;
				if (arr[mid] == target) {
			           return mid;
			    } else {
			        if (arr[mid] < target) {
			        	end = mid - 1;
			        }
			        else {
				        start = mid+1;
				    }
			    } 
			}
		}
		return -1;
	}
	
	
	static int ceilingVal(int arr[], int index) {
		if(index!=-1) {
			if(index!=arr.length-1) {
				int ceil = arr[index+1];
				return ceil;
			}else {
				return -1;
			}
		}else
			return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {11,17,22,36,58,71,82,96};
		System.out.println("Array available: "+Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the target value: ");
		int target = sc.nextInt();
		
		int index = binarySearchAgn(arr, target);
		
		
		if(index!=-1) {
			int ceil = ceilingVal(arr, index);
			if(ceil!=-1) {
				System.out.println("Ceiling value of "+target+" is: "+ceil);
			}else
				System.out.println("Element "+target+" lies at the end of array and hence, no ceiling value exists.");
		}else {
			System.out.print(target+" doesn't lies within the array.");
		}
		

	}

}

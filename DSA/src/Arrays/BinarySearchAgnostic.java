package Arrays;
import java.util.Scanner;
import java.util.Arrays;

//We would first like to know whether the given array is in ascending/descending order
//This is achieved by comparing the first and last element of the array
//We then apply the binary search with appropriate conditions

public class BinarySearchAgnostic {
	
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
	
	public static void main(String args[]) {
		int arr1[] = {5,8,16,25,55,73,86};		//Ascending order
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of the target from the array arr1: "+Arrays.toString(arr1));
		int target1 = sc.nextInt();
		
		int index1 = binarySearchAgn(arr1, target1);
		
	
		if(index1!=-1) {
			System.out.println(target1+" is present at index "+index1);
		}else
			System.out.println("Target element not found.");
		
		
		int arr2[] = {50,42,33,28,20,14,6,1};
		System.out.println("Enter the value of the target from the array arr2: "+Arrays.toString(arr2));
		int target2 = sc.nextInt();
		
		int index2 = binarySearchAgn(arr2, target2);
		
	
		if(index2!=-1) {
			System.out.println(target2+" is present at index "+index2);
		}else
			System.out.println("Target element not found.");
	}
}
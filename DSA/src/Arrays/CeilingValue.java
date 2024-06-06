package Arrays;
import java.util.Scanner;
import java.util.Arrays;


public class CeilingValue {

	static int ceilVal(int arr[], int target) {
		int start=0;
		int end = arr.length-1;
		
		if(target>arr[arr.length-1]) {
			return -1;
		}
		else {
			while(start<=end) {
				int mid = start +(end-start)/2;
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
			return start;
	}
	}
		
	
	public static void main(String[] args) {
		int arr[] = {11,17,22,36,58,71,82,96};
		System.out.println("Array available: "+Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the target value: ");
		int target = sc.nextInt();
		
		int result = ceilVal(arr, target);
				
		if(result!=-1) {
			System.out.println("Ceiling value of "+target+" is: "+arr[result]);
		}else
			System.out.println("Target element is greater than the value at the last index of an array and hence no ceil value exists for it.");
	}

}

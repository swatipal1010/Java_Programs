package Sorting;
import java.util.Scanner;
import java.util.Arrays;

public class MissingNumber {
	//METHOD 1: Using Cyclic Sort
	public static void swap(int[] arr, int index1, int index2) {
	    int temp = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = temp;
	}
	public static int numberMissing(int[] arr) {
		int i=0;
		while(i<arr.length) {
			if(arr[i] < arr.length && arr[i] != i) {
					swap(arr, i, arr[i]);		
			}else{
				i++;
			}		
		}
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j]!=j) {
				return j;
			}
		}
		return arr.length;
	}
	
	
	//METHOD 2: Using total sum of array elements 
	public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int total=(n*(n+1))/2;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return total-sum;
    }
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		System.out.println("Enter "+N+" numbers into the array in the range 0 to "+N);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array is: "+Arrays.toString(arr));
		int missingNum = numberMissing(arr);
		System.out.println("Missing number in the array is: "+missingNum);
		
		int missingNum2 = missingNumber(arr);
		System.out.println("Missing number in the array is: "+missingNum2);
		
		sc.close();

	}

}

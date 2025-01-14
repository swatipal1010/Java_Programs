package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FirstMissingPositive {
	public static int firstPosMissingNum(int[] arr) {
		int n = arr.length;
		int i=0;
		Arrays.sort(arr);
		while(i<arr.length && arr[i]<=0) {
			i++;
		}
		int num=1;
		for (int j = 0; j < n; j++) {
            if (arr[j] == num) {
                num++;  
                while (j + 1 < n && arr[j] == arr[j + 1]) {
                    j++;  
                }
            }
        }
		return num;
	}
	
	
	//METHOD 2: Using Cyclic Sort
	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
	public static int firstPositive(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correctIndex = arr[i]-1;
			if((arr[i]>0 && arr[i]<arr.length)&& arr[i]!=arr[correctIndex]) {
				swap(arr,i, correctIndex);
			}else {
				i++;
			}
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j]!=(j+1)) {
				return j+1;
			}
		}
		return arr.length+1;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array is: "+Arrays.toString(arr));
		int ans = firstPosMissingNum(arr);
		System.out.println("First missing positive number in the array is: "+ans);
		
		int ans2 = firstPositive(arr);
		System.out.println("First missing positive number in the array is: "+ans2);
		sc.close();
	}

}

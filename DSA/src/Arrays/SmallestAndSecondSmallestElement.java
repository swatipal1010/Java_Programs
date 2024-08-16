package Arrays;

import java.util.Scanner;

//Program to return the smallest and second smallest element present in the array

public class SmallestAndSecondSmallestElement {
	public static int[] min2ndMin(int nums[]) {
		int ans[] = new int[2];							//Index 0 stores smallest and index 1 stores 2nd smallest value
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<min) {
				secMin = min;
				min = nums[i];
			}else if(nums[i]>min && nums[i]<secMin) {
				secMin = nums[i];
			}
		}
		
		if(secMin==Integer.MAX_VALUE) {
			ans[0] = -1;
			ans[1] = -1;
		}else {
			ans[0] = min;
			ans[1] = secMin;
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans[] = new int[2];
		ans = min2ndMin(arr);
		System.out.println("Smallest element in the array is: "+ans[0]);
		System.out.println("Second smallest element in the array is: "+ans[1]);

	}

}

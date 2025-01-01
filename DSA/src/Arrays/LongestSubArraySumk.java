package Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import static java.lang.Math.*;

public class LongestSubArraySumk {
	
	//METHOD 1: Using two for loops (T.C. = O(n^2))
	public static int longestSubArray1(int[]arr,int targetSum) {
		int len = arr.length;
		int maxLen = 0;
		for(int i=0; i<len; i++) {
			int sum = 0;
			for(int j=i; j<len; j++) {
				sum += arr[j];
				if(sum>targetSum) break;
				else if(sum==targetSum) {
					maxLen = max(maxLen,(j-i)+1);
				}
			}
		}
		return maxLen;
	}
	
	//METHOD 2: Using HashMap (T.C = O(2n))
	public static int longestSubArray2(int arr[], int targetSum) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    int n = arr.length;

	    int maxLen = 0;
	    int sum = 0;
	    for (int i = 0; i < n; i++) {
	        sum += arr[i];
	        // Check if a valid subarray ends at index i
	        if (sum == targetSum) {
	            maxLen = Math.max(maxLen, i + 1);
	        }
	        // Check if there exists a subarray with the required sum
	        if (map.containsKey(sum - targetSum)) {
	            maxLen = Math.max(maxLen, i - map.get(sum - targetSum));
	        }
	        // Store the first occurrence of the current sum
	        if (!map.containsKey(sum)) {
	            map.put(sum, i);
	        }
	    }
	    return maxLen;
	}

	//METHOD 3: Using two pointers
	public static int longestSubArray3(int[] arr, int targetSum) {
		int right =0;
		int left = 0;
		int n = arr.length;
		
		int sum =0;
		int maxLen = 0;
		while(right<n) {
			while(left<=right && sum>targetSum) {
				sum -= arr[left];
				left++;
			}
			sum += arr[right];
			if(sum==targetSum) {
				maxLen = max(maxLen, right-left+1);
			}
		}
		return maxLen;
	}
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements in the array are: "+Arrays.toString(arr));
		
		System.out.println("Enter the target sum of the subarray: ");
		int targetSum = sc.nextInt();
		
		int ans1 = longestSubArray1(arr, targetSum);
		System.out.println("Length of the longest subarray having sum "+"\'"+targetSum+"\'"+" is: "+ans1);
		
		int ans2 = longestSubArray2(arr, targetSum);
		System.out.println("Length of the longest subarray having sum "+"\'"+targetSum+"\'"+" is: "+ans2);

		int ans3 = longestSubArray2(arr, targetSum);
		System.out.println("Length of the longest subarray having sum "+"\'"+targetSum+"\'"+" is: "+ans3);
		

	}

}

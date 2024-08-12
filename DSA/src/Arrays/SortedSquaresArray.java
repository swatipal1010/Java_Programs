package Arrays;
import java.util.*;

public class SortedSquaresArray {
	//Method -1
	public static int[] sortedsqrArray(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			nums[i] = nums[i]*nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
	
	//Method-2
	public static int[] sortedSqrArray(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		
		int left = 0;
		int right = n-1;
		for(int i=n-1; i>=0; i--) {
			if(Math.abs(nums[left])>Math.abs(nums[right])) {
				result[i] = nums[left]*nums[left];
				left++;
			}else {
				result[i] = nums[right]*nums[right];
				right--;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter in the array: ");
		int size = sc.nextInt();
		
		int nums[] = new int[size];
		System.out.println("Enter "+size+" elements in the array in sorted manner: ");
		for(int i=0; i<size; i++) {
			nums[i] = sc.nextInt();
		}
		
		int result[] = new int[size];
		result = sortedSqrArray(nums);
		System.out.println("Sorted array of squares of elements is : "+Arrays.toString(result));
	}

}

package Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSumSortedArray {
	
	//Method-1 Using HashMap (O(N) space complexity)
	public static int[] twoSumII(int nums[], int target) {
		int result[] = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			int num = nums[i];
			int reqNum = target-num;
			if(map.containsKey(reqNum)) {
				result[0] = i;
				result[1] = map.get(reqNum);
				break;
			}else {
				map.put(nums[i], i);
			}
		}
		Arrays.sort(result);
		return result;
	}
	
	//Method-2 Using two pointers (Constant space complexity)
	public static int[] twoSum(int nums[], int target) {
		int result[] = new int[2];
		int low = 0;
		int high = nums.length-1;
		
		while(low<high) {
			int sum = nums[low]+nums[high];
			if(sum==target) {
				result[0]=low;
				result[1]=high;
				break;
			}else if(sum>target) {
				high--;
			}else {
				low++;
			}
		}
		return result;		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<size; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(nums));
		
		System.out.println("Enter the target sum value. Make sure the elements in the arrays should sum up to give out target number!!");
		int target = sc.nextInt();
		
		int result[] = twoSum(nums, target);
		System.out.println("Index of elements that gives "+target+" as sum: "+Arrays.toString(result));
		

	}

}

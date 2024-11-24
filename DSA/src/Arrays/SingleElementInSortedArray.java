package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class SingleElementInSortedArray {
	
	//METHOD-1 : Determining unique number using XOR operation taking 2 elements at a time
	public static int singleElement1(int[] nums) {
		if(nums.length==1) {
			return nums[0];
		}
		int res = 0;
		for(int i=0; i<nums.length-1; i=i+2) {
			res = nums[i]^nums[i+1];
			if(res!=0) {
				return nums[i];
			}
		}
		return nums[nums.length-1];
	}
	
	
	//METHOD-2 Checking left and right element of each considered element
	public static int singleElement2(int[] nums) {
		if(nums.length==1) {
			return nums[0];
		}
		
		//Edge cases
		if(nums[0]!=nums[1]) return nums[0];
		if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
		
		for(int i=1; i<nums.length-1; i++) {
			if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]) {
				return nums[i];
			}
		}
		return -1;
	}

	
	/* METHOD-3 :Using binary search. In the array before the single element all the duplicate no.s have index of the form (even,odd) 
	and after it the index of duplicate elements is of the form (odd, even) */
	public static int singleElement3(int[] nums) {
		if(nums.length==1) {
			return nums[0];
		}
		if(nums[0]!=nums[1]) {
			return nums[0];
		}
		if(nums[nums.length-1]!=nums[nums.length-2]) {
			return nums[nums.length-1];
		}
		
		int low = 1;
		int high = nums.length-2;
		
		for(int i=1; i<nums.length-1; i++) {
			int mid = low+(high-low)/2;
			if (nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) {
				return nums[mid];
			}else if(mid%2==0 && (nums[mid]==nums[mid+1])) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array(Size should be an odd number): ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements in array in sorted order. Array must contain duplicate elements with only one single element.: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is : "+Arrays.toString(arr));
		
		int ans1 = singleElement1(arr);
		System.out.println("Unique element in the array is: "+ans1);
		
		int ans2 = singleElement2(arr);
		System.out.println("Unique element in the array is: "+ans2);
		
		int ans3 = singleElement3(arr);
		System.out.println("Unique element in the array is: "+ans3);

	}

}

package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroesToRight {
	public static void shiftToRight(int[] nums) {
		if(nums.length==1 && nums[0]==0) {
			return;
		}
		int lastNonZeroIndex = 0;
		//Shift Non-Zero values to the left
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=0) {
				nums[lastNonZeroIndex] = nums[i];
				lastNonZeroIndex++;
			}
		}
		//Fill remaining indexes with 0s
		for(int i=lastNonZeroIndex; i<nums.length; i++) {
			nums[i]=0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0;i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements in the array are:"+Arrays.toString(arr));
		int element = 0;
		boolean exists= false;
		for(int num: arr) {
			if(num==element) {
				exists = true;
				break;
			}
		}
		if(exists) {
			System.out.println("Array after shifting zeroes to right:");
			shiftToRight(arr);
			System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println("Array doesn't contains to be shifted.");
		}

	}

}

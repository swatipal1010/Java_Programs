package Arrays;
import java.util.Scanner;
import java.util.Arrays;


//Given an array nums, return true if the array was originally sorted in non-decreasing order, 
//then rotated some number of positions (including zero). Otherwise, return false
public class IsSortedAndRotated {
	
	public static boolean sortedRotated(int[] nums) {
		int drops = 0; 
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                drops++;
            }
            if (drops > 1) {
                return false;
            }
        }
        return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter "+size+" elements in array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is : "+Arrays.toString(arr));

		boolean result = sortedRotated(arr);
		System.out.println("Array is sorted and rotated? "+result);
	}

}

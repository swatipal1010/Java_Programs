package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement {
	
	public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0; i<nums.length; i++){
            if(nums[i]==nums[i+1]){
                break;
            }
        }
        return nums[i];
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array. Remember to add duplicate element in the array!!");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array is: "+Arrays.toString(arr));
		System.out.println("Duplicate element from the array is: "+findDuplicate(arr));
	}

}

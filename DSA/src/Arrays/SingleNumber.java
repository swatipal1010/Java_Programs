package Arrays;

import java.util.Scanner;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        int result = 0;
        for(int i=0;i<nums.length;i++){
            result = result^nums[i];
        }
        return result;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you will add into the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the "+size+" values in the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = singleNumber(arr);
		System.out.println("The single number obtained is: "+result);

	}

}

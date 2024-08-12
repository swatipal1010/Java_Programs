package Arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {

	public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==1){
            if(nums[0]==1){
                return 1;
            }else{
                return 0;
            }  
        }

        int count=0, maxNum = 0;
        for(int i=0;i<nums.length; i++){
            if(nums[i]==1){
                count++;
            }else{
                maxNum = Math.max(count, maxNum);
                count = 0;
            }
        }
        maxNum = Math.max(count, maxNum);
        return maxNum;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to insert in the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter "+size+" binary numbers in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Maximum consecutive ones in the array are: "+findMaxConsecutiveOnes(arr));

	}

}

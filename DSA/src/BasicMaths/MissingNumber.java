package BasicMaths;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
	
	//Method-1
    public static int missingNumber1(int[] nums) {
        int n=nums.length;
        int sum=0;
        int total=(n*(n+1))/2;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return total-sum;
    }
    
    //Method-2
    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);  

        for (int i = 0; i < n; i++) {
            if (i != nums[i]) {
                return i;  
            }
        }
        return n;
    }
	
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements in the array(values between 0 to "+size+"):");
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		
		System.out.println("Missing number in the array is: "+missingNumber1(arr));
		System.out.println("Missing number in the array is: "+missingNumber2(arr));
	}

}

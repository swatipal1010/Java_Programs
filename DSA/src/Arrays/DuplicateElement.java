package Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashSet;

public class DuplicateElement {
	//Method-1
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
	
	//Method-2
	public static int findDuplicate2(int[] nums) {
        HashSet<Integer> unique = new HashSet<>();
        int i;
        for(i=0; i<nums.length; i++){
            if(unique.contains(nums[i])){
                break;
            }else{
                unique.add(nums[i]);
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
		System.out.println("Duplicate element from the array is (using Method-1): "+findDuplicate(arr));
		System.out.println("Duplicate element from the array is (using Method-2): "+findDuplicate2(arr));
	}

}

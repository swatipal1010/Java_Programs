package Stack;
import java.util.Stack;
import java.util.Arrays;
import java.util.Scanner;

public class NextSmallerElement {
	
	public static int[] nextSmaller(int[] nums) {
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[nums.length];
		Arrays.fill(result,-1);
		
		
		for(int i=nums.length-1; i>=0; i--) {
			while(!stack.isEmpty() && stack.peek()>=nums[i]) {
				stack.pop();
			}
			if(!stack.isEmpty()) {
				result[i] = stack.peek();
			}
			stack.push(nums[i]);
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        System.out.println("Enter " + size + " elements in the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int result[] = nextSmaller(nums);
        System.out.println("Array of previous smaller elements for each element of the array: " + Arrays.toString(result));

	}

}

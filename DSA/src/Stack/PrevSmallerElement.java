package Stack;
import java.util.Stack;
import java.util.Arrays;
import java.util.Scanner;

public class PrevSmallerElement {

    public static int[] prevSmaller(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);  									// Initialize result array with -1

        for (int i = 0; i < nums.length; i++) {  					// Start loop from 0
            while (!stack.isEmpty() && stack.peek() >= nums[i]) {
                stack.pop();  										// Pop elements from stack until a smaller element is found or stack becomes empty
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();  							// The top element is the previous smaller element
            }
            stack.push(nums[i]);  									// Push the current element to the stack
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

        int result[] = prevSmaller(nums);
        System.out.println("Array of previous smaller elements for each element of the array: " + Arrays.toString(result));
    }
}

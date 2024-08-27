package Stack;
import java.util.*;

public class LargestRectInHistogram {
	
	public static int[] prevSmaller(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);  

        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();  
            }
            stack.push(i);  
        }
        return result;
    }

    public static int[] nextSmaller(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        Arrays.fill(result, nums.length);  

        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();  
            }
            stack.push(i);  
        }
        return result;
    }

    public static int largestRectangleArea(int[] heights) {
        int[] prevSmall = prevSmaller(heights);  
        int[] nextSmall = nextSmaller(heights);  

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int width = nextSmall[i] - prevSmall[i] - 1;  
            int area = heights[i] * width;  
            maxArea = Math.max(maxArea, area);  
        }
        return maxArea;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the entire width of histogram: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter height of "+size+" blocks of the histogram: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		int result = largestRectangleArea(arr);
		System.out.println("Largest rectangle area present in the histogram is: "+result);

	}

}

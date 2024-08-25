package Stack;
import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;

public class AsteroidCollision {

	public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            boolean isDestroyed = false; 

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.peek();
                if (Math.abs(asteroid) > Math.abs(top)) {
                    stack.pop();
                } else if (Math.abs(asteroid) == Math.abs(top)) {
                    stack.pop();
                    isDestroyed = true;
                    break;
                } else {
                    isDestroyed = true;
                    break;
                }
            }
            if (!isDestroyed) {
                stack.push(asteroid);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter "+size+" elements into the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements in the array are: "+Arrays.toString(arr));
		
		int result[] = asteroidCollision(arr);
		System.out.println("Array after the asteroid collision: "+Arrays.toString(result));

	}

}

package Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class AsteroidCollision {
	
	//METHOD 1
	public static int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int j = -1; // Pointer to track the last valid asteroid
        
        for (int i = 0; i < n; i++) {
            // Process the current asteroid
            boolean destroyed = false;
            while (j >= 0 && asteroids[i] < 0 && asteroids[j] > 0) {
                if (Math.abs(asteroids[i]) > Math.abs(asteroids[j])) {
                    // Current asteroid destroys the last valid asteroid
                    j--;
                } else if (Math.abs(asteroids[i]) == Math.abs(asteroids[j])) {
                    // Both asteroids destroy each other
                    j--;
                    destroyed = true;
                    break;
                } else {
                    // Current asteroid is destroyed
                    destroyed = true;
                    break;
                }
            }
            
            // If the current asteroid survives, add it to the valid positions
            if (!destroyed) {
                j++;
                asteroids[j] = asteroids[i];
            }
        }
        
        // Return the valid portion of the array
        return Arrays.copyOfRange(asteroids, 0, j + 1);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " asteroids in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array is: " + Arrays.toString(arr));
        int ans[] = asteroidCollision(arr);
        System.out.println("Array after collision: " + Arrays.toString(ans));
        sc.close();

	}

}

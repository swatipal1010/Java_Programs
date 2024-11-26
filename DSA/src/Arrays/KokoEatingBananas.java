package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class KokoEatingBananas {
	
	public static int time(int[] piles, int k) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) { // Iterate through all piles
            time += (piles[i] + k - 1) / k; // Correct ceiling division
        }
        return time;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int maxElement = Integer.MIN_VALUE;

        // Find the maximum element in piles
        for (int num : piles) {
            if (num > maxElement) {
                maxElement = num;
            }
        }

        // Try all possible speeds from 1 to maxElement
        for (int i = 1; i <= maxElement; i++) {
            int timeTaken = time(piles, i);
            if (timeTaken <= h) {
                return i; // Return the first valid speed
            }
        }

        return -1; // If no valid speed is found
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter "+size+" elements in the array in sorted order: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		
		System.out.println("Enter the time within which Koko should eat all the bananas: ");
		int h = sc.nextInt();
		
		int ans = minEatingSpeed(arr, h);
		System.out.println("Koko should eat "+ans+" bananas per hour.");

	}

}

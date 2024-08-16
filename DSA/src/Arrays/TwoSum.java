package Arrays;
import java.util.Scanner;
import java.util.HashMap;

//Given the target sum, find the indices that holds the value which on addition returns the target sum

public class TwoSum {
    
    // METHOD-1 Brute force approach
    public static int[] twoSum(int arr[], int target) {
        int ans[] = new int[2];
        for (int i = 0; i < arr.length - 1; i++) { 
            for (int j = i + 1; j < arr.length; j++) { 
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans; 
                }
            }
        }
        return ans;
    }

    // METHOD-2 Optimized approach (Using HashMap)
    public static int[] twoSumOpti(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) { 
                ans[0] = map.get(target - arr[i]); 
                ans[1] = i; 
                return ans; 
            } else {
                map.put(arr[i], i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Enter " + size + " elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();
        
        int ans[] = twoSumOpti(arr, target); 
        
        
        if (ans[0] != 0 || ans[1] != 0) {			//If there is no pair then nothing is stored in ans[] and it holds only default value (0 at each index)
            System.out.println("Indices of the values that make up the target sum when added together: " + ans[0] + " " + ans[1]);
        } else {
            System.out.println("No valid pair found that sums to the target.");
        }
    }
}

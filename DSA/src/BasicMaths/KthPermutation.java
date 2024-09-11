package BasicMaths;
import java.util.Scanner;

public class KthPermutation {

	public static String getPermutation(int n, int k) {
        StringBuilder result = new StringBuilder();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        k--; // Adjust k to 0-based indexing
        while (n > 0) {
            int factorial = 1;
            for (int i = 1; i < n; i++) {
                factorial *= i;
            }
            int index = k / factorial;
            result.append(nums[index]);
            k %= factorial;
            nums = remove(nums, index);
            n--;
        }

        return result.toString();
    }

    private static int[] remove(int[] nums, int index) {
        int[] newNums = new int[nums.length - 1];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != index) {
                newNums[j++] = nums[i];
            }
        }
        return newNums;
    }
    
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of number n : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the number of permutation that you want: ");
		int k = sc.nextInt();
		
		String ans = getPermutation(n,k);
		System.out.println(k+"th permutation of the number "+n+" is: "+ans);

	}

}

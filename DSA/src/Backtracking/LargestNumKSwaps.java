package Backtracking;
import java.util.Scanner;

public class LargestNumKSwaps {
    // Swap function for swapping two characters in a string
    private static String swap(String num, int i, int j) {
        char[] numArr = num.toCharArray();
        char temp = numArr[i];
        numArr[i] = numArr[j];
        numArr[j] = temp;
        return new String(numArr);
    }

    // Recursive function to find the largest number by swapping
    public static String largestNum(String num, int k) {
        if (k == 0) {
            return num; // Base case: No swaps left
        }

        String maxNum = num; // Store the maximum number found

        // Try swapping each digit with a larger digit from right side
        for (int i = 0; i < num.length() - 1; i++) {
            char maxDigit = num.charAt(i);
            int maxIndex = i;

            // Find the maximum digit in the remaining part
            for (int j = i + 1; j < num.length(); j++) {
                if (num.charAt(j) >= maxDigit) { // Use >= to ensure rightmost max
                    maxDigit = num.charAt(j);
                    maxIndex = j;
                }
            }

            // If a larger digit is found, swap and recurse
            if (maxIndex != i && num.charAt(maxIndex) > num.charAt(i)) {
                String swappedNum = swap(num, i, maxIndex);
                String candidate = largestNum(swappedNum, k - 1); // Recursive call with reduced swaps

                // Update maxNum if a better number is found
                if (candidate.compareTo(maxNum) > 0) {
                    maxNum = candidate;
                }
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String num = sc.nextLine();

        System.out.println("Enter the number of swaps allowed: ");
        int swaps = sc.nextInt();

        String result = largestNum(num, swaps);
        System.out.println("Largest number made out of " + num + " after swapping is: " + result);
        sc.close();
    }
}

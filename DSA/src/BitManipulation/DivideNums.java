package BitManipulation;
import java.util.Scanner;

public class DivideNums {
    
    // Method to divide two numbers without using the division operator
    public static int divide(int dividend, int divisor) {
        // If dividend and divisor are equal, return 1 as the result
        if (dividend == divisor) {
            return 1;
        }

        // Determine the sign of the result (positive or negative)
        boolean sign = true;  // True means the result will be positive
        
        // If either the dividend or divisor is negative, the result will be negative
        if (dividend < 0 && divisor >= 0) {
            sign = false;
        }
        if (divisor < 0 && dividend >= 0) {
            sign = false;
        }

        // Work with the absolute values of the dividend and divisor
        long divnd = Math.abs((long) dividend);  // Use long to handle overflow
        long divs = Math.abs((long) divisor);    // Use long for safety

        int ans = 0;  // This will store the final quotient

        // Loop until the dividend is smaller than the divisor
        while (divnd >= divs) {
            int count = 0;  // This is used to track how many times we can shift left

            // Find the largest power of two such that (divs * 2^count) <= divnd
            while (divnd >= (divs << (count + 1))) {
                count++;
            }

            // After exiting the inner loop, subtract the largest multiple of the divisor from the dividend
            ans += 1 << count;  // Add 2^count to the answer (the quotient)
            divnd -= divs << count;  // Subtract (divs * 2^count) from the dividend
        }

        // Handle overflow cases
        if (ans >= Math.pow(2, 31) && sign) {
            return Integer.MAX_VALUE;  // If the result exceeds max int value, return MAX_VALUE
        }
        if (ans >= Math.pow(2, 31) && !sign) {
            return Integer.MIN_VALUE;  // If the result is less than min int value, return MIN_VALUE
        }

        // Return the final result, apply the sign (positive or negative)
        return sign ? ans : -ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for divisor
        System.out.println("Enter the divisor:");
        int divisor = sc.nextInt();
        
        // Input for dividend
        System.out.println("Enter the dividend:");
        int dividend = sc.nextInt();
        
        // Output the result of the division
        System.out.println(dividend + " divided by " + divisor + " gives: " + divide(dividend, divisor));
    }
}

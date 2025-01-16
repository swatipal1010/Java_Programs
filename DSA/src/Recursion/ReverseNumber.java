package Recursion;
import java.util.Scanner;

public class ReverseNumber {

    // Method 1: Using a return-based approach 
    public static int revNum1(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        int digit = num % 10;
        sum = sum * 10 + digit;
        return revNum1(num / 10, sum);
    }

    // Method 2: Using a helper function
    public static void rev(int n) {
        int digits = (int) (Math.log10(n)) + 1; 		// Count number of digits in the number
        int reversedNum = helper(n, digits);
        System.out.println("Reversed form of " + n + " is: " + reversedNum);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n; 									// Base case: single digit left
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        // Method 1: Return-based approach
        int reversed1 = revNum1(num, 0);
        System.out.println("Reversed form of " + num + " is: " + reversed1);

        // Method 2: Using the helper function
        rev(num);

        sc.close();
    }
}

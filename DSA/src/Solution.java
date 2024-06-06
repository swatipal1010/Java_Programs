import java.util.Scanner;

public class Solution {

    static int findSmallestA(int d) {
        int i = 1; // Start from 1
        while (true) {
            int divisorCount = 1;
            int[] divisors = new int[4]; // Array to store divisors
            divisors[0] = 1;
            int divIndex = 1;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    divisors[divIndex++] = j;
                    divisorCount++;
                    if (divisorCount == 4) {
                        break;
                    }
                    //Check the corresponding divisor (i / j)
                    int otherDivisor = i / j;
                    if (otherDivisor != j) {
                        divisors[divIndex++] = otherDivisor;
                        divisorCount++;
                        if (divisorCount == 4) {
                            break;
                        }
                    }
                }
            }

            if (divisorCount >= 4) {
                // Check the differences between divisors
                boolean valid = true;
                for (int k = 0; k < divIndex - 1; k++) {
                    if (Math.abs(divisors[k] - divisors[k+1]) < d) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    return i;
                }
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt(); // Number of test cases

        System.out.println("Enter the input value 'd' for each test case:");
        for (int i = 0; i < t; i++) {
            int d = sc.nextInt(); // Read d for each test case
            int smallestA = findSmallestA(d);
            System.out.println("For the provided value of d: "+d+" the smallest value of a obtained is: "+smallestA);
        }
    }
}

package BasicMaths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClosestPrimeNum {
    public static int[] closestPrimes(int left, int right) {
        List<Integer> primes = generatePrimes(right);
        List<Integer> inRangePrimes = new ArrayList<>();

        // Filter primes to keep only those in the range [left, right]
        for (int prime : primes) {
            if (prime >= left && prime <= right) {
                inRangePrimes.add(prime);
            }
        }

        // Find the closest pair of primes
        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[]{-1, -1};
        
        for (int i = 0; i < inRangePrimes.size() - 1; i++) {
            int num1 = inRangePrimes.get(i);
            int num2 = inRangePrimes.get(i + 1);
            int diff = num2 - num1;
            
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = num1;
                result[1] = num2;
            }
        }

        return result;
    }

    public static List<Integer> generatePrimes(int max) {
        boolean[] isPrime = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= max; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= max; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        System.out.println("Enter the left value of the from where the range starts: ");
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        System.out.println("Enter the right value where range ends: ");
        int right = sc.nextInt();
        
        int[] result = closestPrimes(left, right);
        System.out.println("Result 1: [" + result[0] + ", " + result[1] + "]");
    }
}

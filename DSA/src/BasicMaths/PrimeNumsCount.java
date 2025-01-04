package BasicMaths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.List;
import java.util.ArrayList;

public class PrimeNumsCount {
	
	public static ArrayList<Integer> countPrimes(int n) {
		ArrayList<Integer> primeNums = new ArrayList<>();
        if (n <= 2) {
            return primeNums; // No primes less than 2
        }

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true); // Initialize all entries as true
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime numbers

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false; // Mark multiples of i as non-prime
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
            	primeNums.add(i);
                count++;
            }
        }
        System.out.println("There are "+count+" prime numbers upto "+n);
        return primeNums;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number before which we will count the number of prime numbers: ");
		int num = sc.nextInt();
		
		ArrayList<Integer> ansList = countPrimes(num);
		if(!ansList.isEmpty()) {
			System.out.println("Prime numbers upto "+num+" are: "+ansList);
		}else {
			System.out.println("There exists no prime number(s) upto "+num);
		}

	}

}

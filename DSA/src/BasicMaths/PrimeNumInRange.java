package BasicMaths;
import java.util.*;

public class PrimeNumInRange {

    // METHOD-1 Sieve of Eratosthenes Algorithm
    public static ArrayList<Integer> primeNumInRange(int range) {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] allNums = new boolean[range + 1];
        
        for (int i = 2; i <= range; i++) {
            allNums[i] = true;
        }       
        // Sieve of Eratosthenes algorithm
        for (int p = 2; p * p <= range; p++) {
            if (allNums[p]) {
                for (int i = p * p; i <= range; i += p) {  
                    allNums[i] = false;  								// Marking multiples of p as false (non-prime)
                }
            }
        }
        for (int i = 2; i <= range; i++) {
            if (allNums[i]) {
                primes.add(i);
            }
        }        
        return primes;
    }
    
    
    //METHOD-2 Optimized trial division approach
    //To check if the passed number is a prime or not
    public static boolean isPrime(int val) {
    	if(val==2 || val==3) return true;
    	if(val%2==0 || val%3==0) return false;
    	
    	for(int i=5 ; i*i<=val; i+=6) {
    		if(val%i==0 || val%(i+2)==0) {
    			return false;
    		}
    	}
    	return true;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Enter the target range up to which you want all the prime numbers: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        
        ArrayList<Integer> result = primeNumInRange(target);
        System.out.println("Prime numbers up to " + target + " are: " + result);
        
       System.out.println("Enter any number you want to test whether it's prime or not: ");
       int num = sc.nextInt();
       
       boolean ans = isPrime(num);
       if(ans) {
    	   System.out.println(num+" is a prime number.");
       }else {
    	   System.out.println(num+" is not a prime number.");
       }
    }
}

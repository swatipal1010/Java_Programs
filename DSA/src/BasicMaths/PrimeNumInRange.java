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
    public static ArrayList<Integer> primeNums(int target){
    	ArrayList<Integer> allPrimes = new ArrayList<>();
    	
    	for(int i=2; i<=target; i++) {
    		boolean ans = isPrime(i);
    		if(ans==true) {
    			allPrimes.add(i);
    		}
    	}
    	return allPrimes;
    }
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
        
        System.out.println("Enter the target range up to which you want all the prime numbers: ");
        int target2 = sc.nextInt();
        ArrayList<Integer> result2 = primeNumInRange(target2);
        System.out.println("Prime numbers up to " + target2 + " are: " + result2);
    }
}

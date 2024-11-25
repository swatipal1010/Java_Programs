package BasicMaths;
import java.util.Scanner;

public class NthRootOfM {
	
	public static int nthRoot(int n, int m) {
        int low = 1;
        int high = m;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long midPower = power(mid, n);
            
            if (midPower == m) {
                return mid; 
            } else if (midPower > m) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        return -1; 
    }
    
    private static long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
            if (result > Integer.MAX_VALUE) {
                break; 
            }
        }
        return result;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base value: ");
		int base = sc.nextInt();
		
		System.out.println("Find the value of nth root: ");
		int n = sc.nextInt();
		
		int ans = nthRoot(n, base);
		System.out.println(n+"th root of "+base+" is: "+ans);	
		
		sc.close();
	}

}

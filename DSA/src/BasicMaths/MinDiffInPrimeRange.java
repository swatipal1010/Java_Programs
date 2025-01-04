package BasicMaths;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class MinDiffInPrimeRange {
	public static ArrayList<Integer> generatePrimes(int right){
		boolean allNums[] = new boolean[right+1];
		Arrays.fill(allNums, true);
		
		for(int p=2; p*p<=right; p++) {
			if(allNums[p]) {
				for(int i=p*p; i<=right; i=i+p) {
					allNums[i]=false;
				}
			}
		}
		
		ArrayList<Integer> primeNums = new ArrayList<>();
		for(int i=2; i<=right; i++) {
			if(allNums[i]) {
				primeNums.add(i);
			}
		}
		return primeNums;
	}

	public static int[] minDiffn(int left, int right) {
		ArrayList<Integer> allPrimes = generatePrimes(right);
		
		ArrayList<Integer> primesInRange = new ArrayList<>();
		
		for(int prime: allPrimes) {
			if(prime>=left && prime<=right) {
				primesInRange.add(prime);
			}
		}
		
		int ans[] = {-1,-1};
		
		int minDiff = Integer.MAX_VALUE;
		for(int i=0; i<primesInRange.size()-1;i++) {
			int prime1 = primesInRange.get(i);
			int prime2 = primesInRange.get(i+1);
			int diff = prime2-prime1;
			if(diff<minDiff) {
				minDiff = diff;
				ans[0] = prime1;
				ans[1] = prime2;
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value of range: ");
		int left = sc.nextInt();
		
		System.out.println("Enter the ending value of range: ");
		int right = sc.nextInt();
		
		int[] ans = minDiffn(left, right);
		System.out.println("Minimum difference between the pair of prime numbers from "+left+" to "+right+" is: "+ans[0]+","+ans[1]);

	}

}

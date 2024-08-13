package BasicMaths;

import java.util.Scanner;

public class PowerOfTwo {
	    public static boolean isPowerOfTwo(int n) {
	        return (n > 0) && ((n & (n-1)) == 0);
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Is "+num+ " a powr of two number? "+isPowerOfTwo(num));
	}

}
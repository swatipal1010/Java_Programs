package Recursion;

import java.util.Scanner;

public class NumberOfZeroes {

    public static int countZeroes(String n, int index, int count) {
        // Base case: when we've processed all characters in the string
        if (index == n.length()) {
            return count;
        }

        // Check if the current character is '0'
        if (n.charAt(index) == '0') {
            return countZeroes(n, index + 1, count + 1);
        }

        return countZeroes(n, index + 1, count);
    }
    
    //METHOD 2
    public static int count(int n) {
    	return helper(n,0);
    }
    private static int helper(int n, int c) {
    	if(n==0) {
    		return c;
    	}
    	int rem = n%10;
    	if(rem==0) {
    		return helper(n/10,c+1);
    	}
    	return helper(n/10,c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt(); // Read input as a string to preserve leading zeros

        int ans = count(num);
        System.out.println("Number of zeroes in " + num + " are: " + ans);

        sc.close();
    }
}
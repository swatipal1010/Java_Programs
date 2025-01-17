package Recursion;

import java.util.Scanner;

public class PalindromeNumber {
	
	//Program to check if the number passed is equal to the reversed number
	public static boolean isPalindrome(int n) {
		int digits = (int) (Math.log10(n)) + 1;
		int reversedVal = revNum(n, digits);
		System.out.println("Reversed value of "+n+" is: "+reversedVal);
		if(reversedVal==n) {
			return true;
		}
		return false;
	}
	//Program to reverse a number
	public static int revNum(int n, int digits) {
		if(n%10==n) {
			return n;
		}
		int rem = n%10;
		return rem * (int) (Math.pow(10, digits - 1)) + revNum(n / 10, digits - 1);	
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		boolean ans = isPalindrome(num);
		if(ans) {
			System.out.println(num+" is a palindrome number.");
		}else {
			System.out.println(num+" is not a palindrome number.");
		}
		sc.close();
	}

}

package Recursion;

import java.util.Scanner;

public class Permutation {
	
	public static void permutation(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed+" ");
			return;
		}
		char ch = unprocessed.charAt(0);
		for(int i=0; i<=processed.length();i++) {
			String first = processed.substring(0,i);
			String second = processed.substring(i, processed.length());
			permutation(first+ch+second, unprocessed.substring(1));
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		
		System.out.println("Possible permutations of "+str+" are: ");
		permutation("", str);
		
		sc.close();

	}

}

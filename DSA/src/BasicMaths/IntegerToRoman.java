package BasicMaths;

import java.util.Scanner;

public class IntegerToRoman {
	
	 public static String intToRoman(int num) {
	        // Arrays to store the Roman numerals and corresponding integer values
	        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	        // StringBuilder to construct the Roman numeral
	        StringBuilder roman = new StringBuilder();

	        // Loop through each value, subtracting it from num and appending the corresponding Roman numeral
	        for (int i = 0; i < values.length; i++) {
	            while (num >= values[i]) {
	                num -= values[i];
	                roman.append(numerals[i]);
	            }
	        }

	        // Return the constructed Roman numeral as a string
	        return roman.toString();
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println("Roman representation of "+num+" is: "+intToRoman(num));

	}

}

package Strings;

import java.util.Scanner;

public class MultiplyStrings {

	public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n1 = num1.length();
        int n2 = num2.length();
        int[] result = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = n2 - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';

                int sum = (digit1 * digit2) + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int r : result) {
            if (!(sb.length() == 0 && r == 0)) {  
                sb.append(r);
            }
        }
        return sb.toString();
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number (as string): ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the second number (as string): ");
		String str2 =sc.nextLine();
		
		System.out.println("Multiplication of "+str1+" and "+str2+ " gives : "+multiply(str1,str2));
		
		

	}

}

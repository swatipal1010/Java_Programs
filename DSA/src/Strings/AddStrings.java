package Strings;
import java.util.Scanner;

public class AddStrings {
	public static int addStr(String str1, String str2) {
	    int carry = 0;
	    int str1Len = str1.length() - 1;
	    int str2Len = str2.length() - 1;
	    int sum = 0;
	    int placeValue = 1;  

	    while (str1Len >= 0 || str2Len >= 0 || carry != 0) {
	        int val1 = (str1Len >= 0) ? str1.charAt(str1Len) - '0' : 0;
	        int val2 = (str2Len >= 0) ? str2.charAt(str2Len) - '0' : 0;

	        int sumOfDigits = val1 + val2 + carry;
	        int digit = sumOfDigits % 10;  
	        carry = sumOfDigits / 10;  

	        sum = sum + digit * placeValue;  
	        placeValue *= 10;  

	        str1Len--;
	        str2Len--;
	    }
	    return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the second number: ");
		String str2 = sc.nextLine();
		
		System.out.println("Sum of "+str1+" and "+str2+" is: "+ addStr(str1, str2));

	}

}

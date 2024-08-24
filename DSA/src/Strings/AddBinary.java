package Strings;
import java.util.Scanner;

public class AddBinary {

	public static String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();
		int aLen = a.length()-1;
		int bLen = a.length()-1;
		int carry = 0;
		
		while(aLen>=0 || bLen>=0 || carry>0) {
			int sum = carry;
			if(aLen>=0) {
				sum += a.charAt(aLen)-'0';
				aLen--;
			}
			if(bLen>=0) {
				sum += b.charAt(bLen)-'0';
				bLen--;
			}
			result.append(sum%2);
			carry = sum/2;
		}
		return result.reverse().toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first binary number string: ");
		String a = sc.nextLine();
		
		System.out.println("Enter second binary number string: ");
		String b = sc.nextLine();
		
		System.out.println("Addition of binary strings "+a+" and "+b+" is: "+addBinary(a,b));

	}

}

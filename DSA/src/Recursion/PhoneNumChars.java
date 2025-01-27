package Recursion;
import java.util.Scanner;
import java.util.ArrayList;

public class PhoneNumChars {
	
	public static void phoneNums(String processed, String unprocessed) {
		if(unprocessed.isEmpty()) {
			System.out.println(processed+" ");
			return;
		}
		int digit = unprocessed.charAt(0)-'0';
		int startRange =(digit-1)*3;
		int endRange = (digit*3)-1;
		for(int i=startRange; i<=endRange && i<=25; i++) {
			phoneNums(processed+(char)('a'+i),unprocessed.substring(1));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input number: ");
		String num = sc.next();
		
		phoneNums("",num);
		
		sc.close();
	}

}

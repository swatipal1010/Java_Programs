package basic_programs;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		int len = str.length();
		char arr1[] = new char[len];
		
		
		//reversed string
		for(int i=len-1;i>=0;i--) {
			arr1[i] = str.charAt(len-1-i);
			
		}
		
		//printing the reversed string
		System.out.print("The reverse string is: ");
		for(int i=0; i<len;i++) {
			System.out.print(arr1[i]);
		}
	}
}

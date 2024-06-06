package MyPrep;
import java.util.Scanner;
//Consider that a string before sending to the receiver is encrypted. Due to some errors the string received at the receiver end 
//when decrypted results in one character missing from the string. Find the missing character.



public class missingChar {
	
	public static char lostChar(String eString, String dString) {
		int len1 = eString.length();
		char result='a';
		
		
		int len2 = dString.length();
		
		if(len1==len2) {
			return '1';
		}
		// Iterate over both strings simultaneously
	    for (int i = 0; i < len1; i++) {
	        // Check if the index is within bounds of the decrypted string
	        if (i >= dString.length() || eString.charAt(i) != dString.charAt(i)) {
	            // The missing character is the one in the encrypted string
	            result = eString.charAt(i);
	            break;
	        }
	    }
		return result;
	}
	public static void main(String[] args) {
		missingChar obj = new missingChar();
		System.out.println("Enter the string for encryption: ");
		Scanner sc = new Scanner(System.in);
		String eString = sc.nextLine();
		
		System.out.println("Enter the decrypted string: ");
		String dString = sc.nextLine();
		
		char missChar = obj.lostChar(eString, dString);
		if(missChar=='1') {
			System.out.println("No character is missing.");
		}else {
			System.out.println("Missing character is: "+missChar);
		}
	}

}

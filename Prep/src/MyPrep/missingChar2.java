package MyPrep;
import java.util.Scanner;

public class missingChar2 {
		
		    public static char lostChar(String eString, String dString) {
		        int len1 = eString.length();
		        int len2 = dString.length();

		        if (len1 == len2) {
		            return '1'; // No character is missing if lengths are equal
		        }

		        // Use XOR to find the missing character
		        int xor = 0;

		        // XOR all characters in the encrypted string
		        for (int i = 0; i < len1; i++) {
		            xor ^= eString.charAt(i);
		        }

		        // XOR all characters in the decrypted string
		        for (int i = 0; i < len2; i++) {
		            xor ^= dString.charAt(i);
		        }

		        // The result will be the ASCII value of the missing character
		        return (char) xor;
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter the string for encryption: ");
		        String eString = sc.nextLine();

		        System.out.println("Enter the decrypted string: ");
		        String dString = sc.nextLine();

		        char missChar = lostChar(eString, dString);
		        if (missChar == '1') {
		            System.out.println("No character is missing.");
		        } else {
		            System.out.println("Missing character is: " + missChar);
		        }

		        sc.close();
	 }
}



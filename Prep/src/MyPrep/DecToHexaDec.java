package MyPrep;
import java.util.Scanner;

public class DecToHexaDec {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a decimal number: ");
		        int decimalNumber = sc.nextInt();

		        String hexadecimal = decimalToHexadecimal(decimalNumber);

		        System.out.println("Hexadecimal equivalent: " + hexadecimal);
		    }

		    public static String decimalToHexadecimal(int decimalNumber) {
		        // Define characters for hexadecimal digits
		        char[] hexDigits = "0123456789ABCDEF".toCharArray();

		        // Check for special case: 0
		        if (decimalNumber == 0) {
		            return "0";
		        }

		        StringBuilder hexBuilder = new StringBuilder();

		        // Convert decimal to hexadecimal manually
		        while (decimalNumber > 0) {
		            int remainder = decimalNumber % 16;
		            hexBuilder.insert(0, hexDigits[remainder]);
		            decimalNumber /= 16;
		        }

		        return hexBuilder.toString();
		    }
}



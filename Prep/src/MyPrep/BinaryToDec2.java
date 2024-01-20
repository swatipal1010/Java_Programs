package MyPrep;
import java.util.Scanner;

public class BinaryToDec2 {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the binary number: ");
		        String binaryInput = sc.nextLine();

		        //Calling the method binaryToDecimal()
		        int decimalEquivalent = binaryToDecimal(binaryInput);
		        
		        System.out.println("The decimal equivalent of the binary number is: " + decimalEquivalent);
		    }

			//method
		    public static int binaryToDecimal(String binaryInput) {
		        int decimalEquivalent = 0;
		        int n = binaryInput.length();						//Length of the entered binary number

		        for (int i = 0; i < n; i++) {
		            char binaryDigit = binaryInput.charAt(n - 1 - i);   //Getting the character starting from end of the binary string
		            
		            // Ensure the input is a valid binary digit (0 or 1)
		            if (binaryDigit != '0' && binaryDigit != '1') {
		                System.out.println("Invalid binary digit: " + binaryDigit);
		                return -1; 
		            }

		            //Getting the numerical value of the character of the string
		            int digitValue = Character.getNumericValue(binaryDigit);
		            decimalEquivalent += digitValue * Math.pow(2, i);
		        }

		        return decimalEquivalent;
		    }
		}


	



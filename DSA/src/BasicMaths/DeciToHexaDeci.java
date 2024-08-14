package BasicMaths;

import java.util.Scanner;

public class DeciToHexaDeci {
	
	public static String toHex(int num) {
        if(num == 0){
            return "0";
        }

        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder hex = new StringBuilder();

        // Process the number as unsigned right shift, until all bits are processed.
        while(num != 0) {
            int rem = num & 15; 				// Get the last 4 bits (equivalent to num % 16)
            hex.insert(0, hexChars[rem]); 		// Prepend the corresponding hex character
            num >>>= 4; 						// Unsigned right shift by 4 bits
        }

        return hex.toString();
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number either positive or negative: ");
		int deciNum = sc.nextInt();
		
		String ans = toHex(deciNum);
		System.out.println("HexaDecimal equivalent of "+deciNum+" is: "+ans);
	}

}

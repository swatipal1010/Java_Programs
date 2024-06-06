package MyPrep;
import java.util.Scanner;
import static java.lang.Math.*;

public class BinaryToDec3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the binary number: ");
		int binary = sc.nextInt();
		
		int lenCount = count(binary);
		
		System.out.print("Decimal equivalent of "+binary+" is: ");
		int temp = binary;
		int decNum = 0;
		for(int i=0; i<lenCount; i++) {
			int digit = temp%10;
			decNum += digit*pow(2,i);
			temp = temp/10;
		}
		System.out.print(decNum);

	}
	
	static int count(int num) {
		int numCount = 0;
		while(num!=0) {
			num = num/10;
			numCount++;
		}
		return numCount;
	}
}

package MyPrep;
import java.util.Scanner;

public class DecToBinary3 {

	public static void main(String[] args) {
	
		    int binary[] = new int[8];
		    
		    System.out.println("Enter a number: ");
		    
		    int num;
		    Scanner sc = new Scanner(System.in);
		    num = sc.nextInt();
		    
		    decimalToBinary(num, binary);
		    for(int i=0; i<8;i++){
		        System.out.print(binary[i]);
		    }

	}
	static void decimalToBinary(int decimal, int binary[]) {
	    int i = 7;
	    while (decimal > 0) {
	        binary[i--] = decimal % 2;
	        decimal /= 2;
	    }
	    // Fill remaining bits with zeros
	    while (i>=0) {
	        binary[i--] = 0;
	    }
	}
}

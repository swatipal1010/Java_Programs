package MyPrep;
import java.util.Scanner;

public class DecToBinary2 {

	public static void main(String[] args) {
		Scanner sc = new 	Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int num = sc.nextInt();
		
		System.out.println("The binary equivalent of "+num+" is: ");
		
		for(int i=16-1;i>=0;i--) {
			if((num & (1<<i))==0) {			//Doing the Binary AND operation of ith bit of decimal number with 1
				System.out.print(0);
			}else {
				System.out.print(1);
			}
		}
		System.out.println();
	}

}

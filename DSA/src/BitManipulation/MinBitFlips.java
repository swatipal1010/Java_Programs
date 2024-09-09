package BitManipulation;
import java.util.Scanner;

public class MinBitFlips {

	public static int minBitFlips(int start, int target) {
		int xorResult = start^target;
		int count = 0;
		while(xorResult>0) {
			count += xorResult&1;
			xorResult >>= 1;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the source number: ");
		int source = sc.nextInt();
		
		System.out.println("Enter the target number: ");
		int target = sc.nextInt();
		
		System.out.println("Number of minimum bits that needs to be flipped to convert "+source+" to "+target+" are: "+minBitFlips(source, target));

	}

}

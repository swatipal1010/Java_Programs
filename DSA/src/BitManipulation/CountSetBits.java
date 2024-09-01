package BitManipulation;
import java.util.Scanner;

public class CountSetBits {

	public static int countBits(int num) {
		int count =0;
		for(int i=1; i<=num; i++) {
			int n = i;
			if((n&1)==1) {
				count++;
			}
			while(n!=0) {
				n = n>>1;
				if((n&1)==1) {
					count++;
				}				
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number upto which you want to count all the set bits: ");
		int num = sc.nextInt();
		
		System.out.println("Number of set bits in numbers from 1 to "+num+" are: "+countBits(num));

	}

}

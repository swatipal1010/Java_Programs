package BitManipulation;
import java.util.Scanner;

public class IthBitSet {

	public static boolean checkSetBit(int num, int n) {
		if((num & (1<<n))!=0){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter the number of bit of "+num+" you want to check is set or not(0 based indexing): ");
		int n = sc.nextInt();
		
		boolean result = checkSetBit(num,n);
		System.out.println(n+"th bit of "+num+" is set? "+result);
		

	}

}

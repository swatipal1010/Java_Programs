package BitManipulation;
import java.util.Scanner;

public class PowerOfTwo {
	
	public static boolean powerOf2(int num) {
		int n = num-1;
		if((num&n)==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println(num+" is a power of 2 number? "+powerOf2(num));

	}

}

package BitManipulation;
import java.util.Scanner;

public class XORinARange {
	
	public static int xor(int a) {
		int ans = a%4;
		switch(ans) {
		case 0:
			ans = 0;
			break;
		case 1:
			ans = 1;
			break;
		case 2:
			ans = a+1;
			break;
		case 3:
			ans = 1;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number from where the range starts: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number where the range finishes: ");
		int b = sc.nextInt();
		
		int result = xor(a-1)^xor(b);
		System.out.println("XOR of values from "+a+" to "+b+" is: "+result);
		

	}

}

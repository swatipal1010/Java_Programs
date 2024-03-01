package MyPrep;
import java.util.Scanner;

public class CountOfDigit {
	public static int count(int number, int digit) {
		int count =0;
		while(number !=0) {
			int rem = number%10;
			if(rem==digit)
				count++;
			number = number/10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("Enter the number whose count of occurance you want to find: ");
		int dig = sc.nextInt();
		
		int result = count(num,dig);
		System.out.println("Count of "+dig+ " in "+num+" is: "+result);

	}

}

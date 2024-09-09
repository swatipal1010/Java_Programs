package BasicMaths;
import java.util.Scanner;

public class UglyNumber {
	
	//Ugly number is that number whose prime factors are only limited to 2,3 and 5 only
	public static boolean isUgly(int num) {
		while(num%2==0) {
			num/=2;
		}
		while(num%3==0) {
			num/=3;
		}
		while(num%5==0) {
			num/=5;
		}
		
		return num==1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println("Is "+num+" an ugly number? "+!(isUgly(num)));

	}

}

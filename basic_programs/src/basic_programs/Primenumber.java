package basic_programs;
import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		boolean res = true;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println(num+" is not a prime number");
				res = false;
				break;
			}
		}
		if(res==true)
			System.out.println(num+" is a prime number.");

	}

}

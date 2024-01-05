package basic_programs;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		
		//Calculating number of digits in a number
		int temp =num;
		int digits=0;
		
		while(temp>0) {
			temp = temp/10;
			digits++;
		}

		//Checking for Armstrong number
		int last = 0;
		int sum =0;
		temp = num;
		while(temp>0) {
			//calculate late digit from the number
			last = temp%10;
			//calculates the power of a number up to digit times and add the resultant to the sum variable  
			sum += (Math.pow(last, digits));
			//removes the last digit
			temp = temp/10;
		}
		if(num==sum)
			System.out.println(num+" is an Armstrong Number.");
		else
			System.out.println(num+ " is not an Armstrong Number.");
	}

}

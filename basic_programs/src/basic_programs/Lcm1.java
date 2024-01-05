package basic_programs;
import java.util.Scanner;

public class Lcm1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		//finding the gcf(greatest common factor of num1 and num2)
		int gcf = 1;
		for(int i=1; i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0)
				gcf=i;
		}
		
		int lcm = (num1*num2)/gcf;
		System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm);
	}

}

package basic_programs;
import java.util.Scanner;

public class Lcm2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		// maximum number between n1 and n2 is stored in lcm
		int lcm = (num1>num2)?num1:num2;   								//LCM of numbers is >= greatest of two numbers
		
		//always true
		while(true) {														//we are looking for the least number that can be divided 
			if(lcm%num1==0 && lcm%num2==0) {								//by both num1 and num2
				System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm);
				break;
			}
			lcm++;
		}
	}

}

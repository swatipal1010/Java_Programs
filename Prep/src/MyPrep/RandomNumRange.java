package MyPrep;
import java.util.Scanner;

public class RandomNumRange {
	//generating the numbers between the range 10 to 1000
	public static void main(String[] args) {
		int num = (int)(Math.random()*(1000-10+1)+1);				//Math.random()*(1000-10+1) gives the range 0.0(inclusive) to 991.0(exclusive)
																   //Adding 10 gives the random no.s in the range (0.0+10) to (990.0+10)
		System.out.println("The resulted random number is: "+num);
		
		if(num>=10 && num<=200) 
			System.out.println(num+" lies in the range 10 to 200");
		else if(num>=201 && num<=400)
			System.out.println(num+" lies in the range 201 to 400");
		
		else if(num>=401 && num<=700)
			System.out.println(num+" lies in the range 401 to 700");
		else 
			System.out.println(num+" lies in the range 701 to 1000");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Wants to generate numbers within your own defined range?? \nWrite yes or no.");
		String option = sc.nextLine();
		
		switch(option) {
		case "yes":
			System.out.print("Enter the lower limit: ");
			int a = sc.nextInt();
			System.out.print("Enter the upper limit: ");
			int b = sc.nextInt();
			int random2 = (int)(Math.random()*(b-a+1)+a);
			System.out.println("Number generated between the range "+a+"-"+b+" is: "+random2);
			break;
		case "no":
			System.out.println("No problem. You can anytime generate random numbers within your desired range.");
		}
		
	}

}

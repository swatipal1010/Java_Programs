package MyPrep;
import java.util.Scanner;


public class Interests {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Want you want to calculate? SI or CI? Type it here: ");
        String str = sc.nextLine();
        
        System.out.println("Enter the amount: ");
        double amount = sc.nextDouble();
        
        System.out.println("Enter the rate: ");
        double rate = sc.nextDouble();
        
        System.out.println("Enter the time period: ");
        double time = sc.nextDouble();
        
        switch(str) {
        case "SI":
        	double SI = (amount*rate*time)/100;
        	System.out.printf("The calculated simple interest is: %.3f",SI);
        	break;
        case "CI":
        	System.out.println("Enter the number of time interest is compounded per year: ");
        	int n = sc.nextInt();
        	double CI = amount*Math.pow(1+rate/n, n*time);
        	System.out.printf("Compound interest is: %.3f",CI);
        	break;
        }

	}

}

package revision;
import java.util.Scanner;

public class QuadRoots {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d;
		double p, x1, x2;
		
		System.out.println("Enter the integer value of coefficient of x^2 : ");
		int a = sc.nextInt();
		System.out.println("Enter the integer value of coefficient of x : ");
		int b = sc.nextInt();
		System.out.println("Enter the value of constant : ");
		int c = sc.nextInt();
		
		d = b*b-4*a*c;
		System.out.println("Value of the discriminant: "+d);
		
		if(d<0)
		{
			d = -d;				//If discriminant is negative, making it positive
			p = Math.sqrt(d);
			
			System.out.println("Roots are imaginary.");
			System.out.println("x1 = "+(-b/(2*a))+ "+i*" + (p/(2*a)));
			System.out.println("x2 = "+(-b/(2*a))+ "-i*" + (p/(2*a)));
		}
		
		else
			if(d==0) {
				System.out.println("Roots are equal.");
				System.out.println("x1 = "+(-b/(2*a)));
				System.out.println("x2 = "+(-b/(2*a)));
			}
			else {
				p = Math.sqrt(d);
				System.out.println("Roots are real and distinct.");
				System.out.println("x1 = "+(-b/(2*a)+ p/(2*a)));
				System.out.println("x2 = "+(-b/(2*a)- p/(2*a)));
			}
	}

}

package MyPrep;
import java.util.Scanner;
import static java.lang.Math.*;

public class QuadEqnRoots {

	public static void main(String[] args) {
		System.out.println("Quadratic equation is of the form: ax^2+bx+c = 0");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the coefficient of x^2: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the coefficient b: ");
		int b = sc.nextInt();

		System.out.println("Enter the contant c: ");
		int c = sc.nextInt();
		
		System.out.println("The equation formed is: "+a+"x^2+"+b+"x+"+c+" = 0");
		
		int num = (b*b)-(4*a*c);
		
		System.out.println("Value of b^2-4ac = "+num);
		
		double x1=0;
		double x2 = 0;
		if(num>=0){
			x1 = (double)(-b+Math.sqrt(num))/2*a;
			x2 = (double)(-b-Math.sqrt(num))/2*a;
			System.out.printf("Roots are: %.3f and %.3f",x1,x2);
		}
		else {
			System.out.println("Roots cannot be defined");
		}
		
	}

}

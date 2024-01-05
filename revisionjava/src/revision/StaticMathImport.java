package revision;
import java.util.Scanner;
import static java.lang.Math.*;

public class StaticMathImport {

	public static void main(String[] args) {
		double a, b, t;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		a = sc.nextDouble();
		
		System.out.println("Enter the value of b");
		b = sc.nextDouble();
		
		System.out.println("Enter the value of t");
		t = sc.nextDouble();
		
		double z = (a*pow(E, (b*t/2))*sin(10*t*PI/180)*pow(log(pow(a, 2.5)), log10(a*t)))/ (200*a*cos(PI/3)); //Directly using method of Math class
		System.out.printf("z = %.3f\n",z);

	}

}

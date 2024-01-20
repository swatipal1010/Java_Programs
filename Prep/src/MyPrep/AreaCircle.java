package MyPrep;
import java.util.Scanner;

public class AreaCircle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final float PI = 3.14f;
		System.out.println("Enter the radius of the circle: ");
		int r = sc.nextInt();
		
		double area = PI*Math.pow(r, 2);
		System.out.printf("Area of the circle is: %.3f",area);
	}
	
}

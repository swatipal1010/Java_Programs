package revision;
import java.util.Scanner;
public abstract class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side1 of triangle: ");
		int a = sc.nextInt();
		System.out.println("Enter the side2 of the triangle: ");
		int b = sc.nextInt();
		System.out.println("Enter the side3 of the triangle: ");
		int c = sc.nextInt();
		
		double s = (double)((a+b+c)/2);
		double ar = s*(s-a)*(s-b)*(s-c);
		double area = Math.sqrt(ar);
		
		System.out.printf("Area of triangle is %.2f: ",area);

	}

}

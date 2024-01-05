package revision;
import java.util.Scanner;
public class AreaOfRect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		int n = sc.nextInt();
		
		System.out.print("Enter the breadth of the rectangle: ");
		int m = sc.nextInt();
		
		int area = n*m;
		System.out.println("Area of the rectangle is: "+area);

	}

}

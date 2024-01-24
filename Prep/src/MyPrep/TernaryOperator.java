package MyPrep;
import java.util.Scanner;


public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the four numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int greatestOf3 = (a > b ? (a > c ? a : c) : (b > c ? b : c));
		System.out.println("Greatest among "+a+","+b+" and "+c+" is: "+greatestOf3);
		
		/* int greatestOf3 = (n>m?n:m)>p ? (n>m?n:m) : p; */

		int greatestOf4 = (a>b?a:b)>(c>d?c:d) ? (a>b?a:b): (c>d?c:d);
		System.out.println("Greatest among "+a+","+b+","+c+" and "+d+" is: "+greatestOf4);
	}

}

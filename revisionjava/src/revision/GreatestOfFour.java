package revision;
import java.util.Scanner;

public class GreatestOfFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number 'w': ");
		int w = sc.nextInt();
		
		System.out.println("Enter the second number 'x': ");
		int x = sc.nextInt();
		
		System.out.println("Enter the third number 'y': ");
		int y = sc.nextInt();
		
		System.out.println("Enter the fourth number 'z': ");
		int z = sc.nextInt();
		
		System.out.println("Greatest anmong "+w+" ,"+x+" ,"+y+" ,"+z+" is:");
		//Method-1
		int max1 = ((w>x?w:x)>y?(w>x?w:x):y)>z ? ((w>x?w:x)>y?(w>x?w:x):y) :z;
		System.out.println(max1);
		
		//Method-2
		int max = (w >= x && w >= y && w >= z) ? w :
	          (x >= y && x >= z) ? x :
	          (y >= z) ? y :
	          z;
		System.out.println(max);
	}

}

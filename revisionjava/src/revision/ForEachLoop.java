package revision;
import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int a = sc.nextInt();
		
		int array[] = new int[a];
		
		System.out.println("Enter the elements in the array: ");
		for(int i=0; i<a; i++) {
			array[i] = sc.nextInt();
		}
		
		//USING FOR-EACH LOOP TO ACCESS THE ELEMENTS OF THE ARRAY
		System.out.println("Elements inside the array are: ");
		for(int x: array) {
			System.out.print(x+" ");
		}
		
		
	}

}

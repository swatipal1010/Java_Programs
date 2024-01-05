package revision;
import java.util.Scanner;

public class ArrayOfCubes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want in the array :");
		int a = sc.nextInt();
		//System.out.println();
		
		int array[] = new int[a];
		int n = array.length;
		
		System.out.println("Enter the elements in the array: ");
		for(int i=0; i<n; i++) {
			array [i] = sc.nextInt();
		}
		
		int array2[] = new int[a];
		System.out.print("Cube values of elements in the array: ");
		for(int j=0; j<n; j++) {
			array2[j] = array[j]*array[j]*array[j];
			System.out.print(array2[j]+" ");
		}

	}

}

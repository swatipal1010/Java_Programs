package revision;
import java.util.Scanner;

public class ArrayEvenNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int n = array.length;
		System.out.println("Enter the elements in the array: ");
		
		for(int j=0; j<n; j++)
			array[j] = sc.nextInt();
		
		System.out.println("The even numbers in the array are: ");
		for(int i =0; i<n; i++) {
			if(array[i]%2 == 0)
				System.out.println(array[i]);
		}
		

	}

}

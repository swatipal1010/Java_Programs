package revision;
import java.util.Scanner;
public class arrays1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int[10]; 
		int n = arr1.length;
		
		System.out.print("Enter the elments in the array: ");
		System.out.println();
		
		for(int i =0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		System.out.print("Elements in the array are: ");
		for(int j=0; j<n; j++) {
			System.out.print(arr1[j]);
		}

	}

}

package revision;
import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr5 = new int[10];
		int n = arr5.length;
		
		System.out.println("Enter the value in the array: ");
		for(int j=0; j<n; j++) {
			arr5[j] = sc.nextInt();
		}
		System.out.println("Enter the value to be searched: ");
		int b = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			if(arr5[i]==b)
				System.out.println("Element found at: "+i);
			else
				System.out.println("Element not found in the array");
		}
	}

}

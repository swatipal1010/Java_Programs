package revision;
import java.util.Scanner;

public class NumIndexSquareArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values to be entered in the array:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the values in the array: ");
		for(int i =0; i<n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Index \t Number \t Square");
		for(int i=0; i<n; i++) {
			System.out.println(i +"\t"+ arr[i]+"\t"+"\t"+ arr[i]*arr[i]  );
		}
	}

}

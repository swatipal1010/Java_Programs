package MyPrep;
import java.util.Scanner;

public class BinaryToDec1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The digits will be stored in the array");
		System.out.println("Specify the length of the array: ");
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter the binary digit one by one: ");
		
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("The binary number is: ");
		for(int i=0; i<n;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		int sum=0;
		int digit=0;
		System.out.print("The decimal equivalent of passed binary number is: ");
		for(int i=0;i<n;i++) {
			sum += (int)arr[n-1-i]*Math.pow(2, i);
		}
		System.out.print(sum);
		

	}

}

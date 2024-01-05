package revision;
import java.util.Scanner;

public class ArraySumOddNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr4[] = new int[10];
		int n = arr4.length;
		
		int sum =0;
		
		System.out.println("Enter the elements: ");
		for(int k=0; k<n; k++) {
			arr4[k] = sc.nextInt();
		}
		System.out.print("The odd numbers in the array are: ");
		for(int i=0; i<n; i++) {
			
			if(arr4[i]%2==1) {
				System.out.print(arr4[i]+" ");
				sum = sum+arr4[i];
			}
		}
		System.out.println();
		System.out.println("Sum of the odd numbers is: "+sum);

	}

}

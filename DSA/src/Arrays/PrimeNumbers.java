package Arrays;
import java.util.Scanner;


public class PrimeNumbers {

	static String[] PrimeNums(int arr[]) {
		String responses[] = new String[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			boolean prime = primeNum(arr[i]);
			if(prime) {
				responses[i] = "YES";
			}else
				responses[i] = "NO";
		}
		return responses;
	}
	
	//Function to check whether the number in the array is prime or not
	static boolean primeNum(int num) {
		for(int j=2; j<=Math.sqrt(num);j++) {
			if(num%j==0) {
				return false;
			}
		}
		return true;
	}
	
	
	//main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("T-Prime numbers in the array are: ");
		String responses[] = PrimeNums(arr);
		for(int j=0; j<responses.length; j++) {
			System.out.println(arr[j]+" : "+responses[j]);
		}
	}
}

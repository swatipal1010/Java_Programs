package Arrays;

import java.util.Scanner;

//We count the number of digits of each element of the array by converting each element to string and then counting its length
public class EvenNumOfDigits2 {
		
	static int evenNumDigits(int arr[]) {
		int count=0;
		for(int x: arr) {
			String str = String.valueOf(x);			//valueOf() function converts the numerical value to String
			int len = str.length();				
			if(len%2==0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements in the array are: ");
		for(int x: arr) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		int result = evenNumDigits(arr);
		System.out.println("Number of elements in the array having even number of digits: "+result);

	}

}

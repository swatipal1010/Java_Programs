package Arrays;
import java.util.Scanner;


//We count the digits of each element of the array using / operator
public class EvenNumOfDigits1 {
	
	static int evenNumDigits(int arr[]) {
		int numCount = 0;
		for(int x: arr) {
			int count =0;
			while(x!=0) {
			x = x/10;
			count++;
			}
			if(count%2==0)
				numCount++;
		}
		return numCount;
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

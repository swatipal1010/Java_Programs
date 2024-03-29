package Arrays;
import java.util.Arrays;

public class TwoDArray1 {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		
		int k=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = k;
				k++;
			}
		}
		
		//Method-1 to print the values of the 2D Array
		System.out.println("Values stored within the array: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//Method-2 to print the values within the array
		System.out.println("Values stored within the array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		//Method-3 to print the values of the values in the array
		System.out.println("Values stored within the array: ");
		for(int[] x: arr) {
			System.out.println(Arrays.toString(x));
		}

	}

}

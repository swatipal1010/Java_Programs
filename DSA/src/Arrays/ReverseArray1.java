package Arrays;
import java.util.Scanner;

public class ReverseArray1 {

	static void reverse(int arr[]) {
	    int[] reversedArray = new int[arr.length]; 				// Create a new array to store reversed elements
	    for (int i = 0; i < arr.length; i++) {
	        reversedArray[i] = arr[arr.length - 1 - i]; 		// Copy elements from original array in reverse order
	    }
	    
	    // Copy reversed elements back to the original array
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = reversedArray[i];
	    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in the array before reversing are: ");
        for (int x : arr) {
            System.out.println(x);
        }
        
        reverse(arr);
        
        System.out.println("Elements in the array after reversing are: ");
        for (int x : arr) {
            System.out.println(x);
        }
        

	}

}

package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class OneDArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[4];
		
		System.out.println("Enter the values in the array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(arr));
	}

}

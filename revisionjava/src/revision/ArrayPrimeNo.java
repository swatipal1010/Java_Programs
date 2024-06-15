package revision;
import java.util.Scanner;

public class ArrayPrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       int count=0;
	        
	       System.out.println("Enter the number of elements you want in the array : ");
	       int num = sc.nextInt();
	       
	       int arr[] = new int[num];
	       
	       System.out.println("Enter the elements: ");
	       for(int i = 0; i < arr.length; i++) 
	          arr[i] = sc.nextInt(); 
	       
	       System.out.print("Prime numbers among: ");
	       for (int i = 0; i < arr.length; i++) {
	          int j = 2;
	          int p = 1;
	          while (j < arr[i]) {
	             if (arr[i] % j == 0) {
	                p = 0;
	                break;
	             }
	             j++;
	          }
	          if (p == 1) {
	             System.out.print(" " + arr[i]);
	          }
	      }
	}

}

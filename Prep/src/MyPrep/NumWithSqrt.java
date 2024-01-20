package MyPrep;
import java.util.Scanner;

public class NumWithSqrt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers you want to print along with their square roots: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		System.out.println("Enter the numbers: ");
		
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Numbers with their square roots:");
		for(int i=0;i<num;i++) {
			 System.out.printf("%d\t%.3f\n", arr[i], Math.sqrt(arr[i]));
        }
		}
	}



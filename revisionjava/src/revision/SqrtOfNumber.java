package revision;
import java.util.Scanner;

public class SqrtOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		
		System.out.println("Enter the numbers: ");
		for(int i=0; i<10; i++) {
			array[i] = sc.nextInt();
			System.out.println();
		}
		System.out.println("The numbers and their square root in array are: ");
		System.out.println("Number"+  "\t" + "Square Root"+ "\t"+"\t"+ "Square");
		for(int i=0; i<10; i++)
			System.out.println(array[i]+"\t" + Math.sqrt(array[i])+"\t"+ "\t"+ Math.pow(array[i], 2));
		
		
		}

}

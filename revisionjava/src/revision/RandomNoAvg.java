package revision;
import java.util.Scanner;

public class RandomNoAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of numbers you want to generate randomnly ");
		int n = sc.nextInt();
		int sum = 0;
		int array[] = new int[n];
		
		for(int i=0; i<n; i++)
			array[i] = (int)(10*Math.random());
		
		System.out.println("Numbers generated are: ");
		for(int i =0; i<n; i++)
			System.out.println(array[i]);
		
		System.out.println("Average of the random numbers generated is: ");
		for(int i =0; i<n; i++)
			sum += array[i];
		System.out.print(sum/n);
	}

}

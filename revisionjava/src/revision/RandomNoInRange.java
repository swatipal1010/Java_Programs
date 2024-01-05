package revision;
import java.util.Scanner;

//Program to generate random numbers in the limits a and b.Both a and b are included in the range & are entered by the user.
public class RandomNoInRange {
	int randomized(int min, int max) {
		return (int)((Math.random()*(max-min)) +min);
	}
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower bound of the random numbers: ");
		int l = sc.nextInt();
		
		System.out.println("Enter the upper bound of the random numbers: ");
		int u = sc.nextInt();
		
		System.out.println("Enter the number of random numbers you want to generate between the range "+" "+l+" "+ "to"+" "+u);
		int n = sc.nextInt();
		
		int array[] = new int[n];
		
		RandomNoInRange random = new RandomNoInRange();
		
		for(int i=0; i<n; i++) {
			array[i] = random.randomized(l, u);
		}
		
		System.out.println("Random numbers generated so far are: ");
		for(int i =0; i<n; i++)
			System.out.print(array[i]+" ");

	}

}

package basic_programs;
import java.util.Scanner;

public class RandomNumInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter min range: ");
		int minRange  = sc.nextInt();
		
		System.out.println("Enter max range: ");
		int maxRange = sc.nextInt();
		
		System.out.println("Enter how many random numbers you want to generate: ");
		int nums = sc.nextInt();
		
		for(int i=0;i<nums;i++) {
			int random = (int)(Math.random()*(maxRange-minRange+1)+minRange);
			System.out.println("Random integer number generated between "+minRange+" and "+maxRange+" is: "+random);
		}
		
		
	}

}

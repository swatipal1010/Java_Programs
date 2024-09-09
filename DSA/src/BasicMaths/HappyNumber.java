package BasicMaths;
import java.util.Scanner;
import java.util.HashSet;

public class HappyNumber {

	
	public static int sqOfDigits(int n) {
		int sum = 0;
		while(n>0) {
			int digit = n%10;
			sum += digit*digit;
			n/=10;
		}
		return sum;
	}
	//Method-1 Using Hashset to keep track of the number already seen
	public static boolean happyNum1(int num) {
		HashSet<Integer> set = new HashSet<>();
		if(num==1) {
			return true;
		}
		
		int squr = sqOfDigits(num);
		while(squr!=1) {
			if(set.contains(squr)) {
				return false;
			}
			set.add(squr);
			squr = sqOfDigits(squr);
		}
		return true;
	}
	
	
	//Method-2 Using Floyd's algorithm(Hare turtle approach) to detect the cycle i.e. if number isn't a happy no. a cycle will be detected
	public static boolean happyNum2(int num) {
		if(num==1) {
			return true;
		}
		int hare = num;
		int turtle = num;
		do {
			turtle = sqOfDigits(turtle);
			hare = sqOfDigits(sqOfDigits(hare));
		}while(turtle!=hare);
		
		return turtle==1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println("Is "+num+" a happy number? "+happyNum1(num));
		System.out.println("Is "+num+" a happy number? "+happyNum2(num));


	}

}

package MyPrep;
import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		int luckyOne =0;
		int luckyTwo = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		luckyOne = sc.nextInt();
		
		
		switch(luckyOne) {
		case 10:
			System.out.println("You win a TV");
			System.out.println("Enter an integer number: ");
			luckyTwo = sc.nextInt();
			
			//internal nested switch within a case
			switch(luckyTwo) {
			case 13:
				System.out.println("You also win a radio.");
				break;
			case 15:
				System.out.println("You have win a Dining Table.");
				break;
			default:
				System.out.println("Sorry, No more prize.");
			}
			break;
			
		case 20:
			System.out.println("You have win a laptop");
			System.out.println("Enter an integer number: ");
			luckyTwo = sc.nextInt();
			
			//internal nested switch within a case
			switch(luckyTwo) {
			case 23:
				System.out.println("You also win a radio.");
				break;
			case 25:
				System.out.println("You have win a Dining Table.");
				break;
			default:
				System.out.println("Sorry, No more prize.");
			} //end of inner switch statements
			break;
			
		}

	}

}

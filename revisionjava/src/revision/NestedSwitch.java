package revision;
import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		int luckyOne = 0;
		int luckyTwo = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number");
		luckyOne = sc.nextInt();
		
		switch(luckyOne) {														//OUTER SWITCH
		case 10:
			System.out.println("Congratulations! You win a TV.");
			System.out.println("Enter an another integer number");
			luckyTwo = sc.nextInt();
			
			switch(luckyTwo) {													//INNER SWITCH WITHIN FIRST CASE
			case 13:
				System.out.println("Congratulations! You also win a radio.");
				break;
			case 15:
				System.out.println("Congratulations! You also win a dining set.");
				break;
			default:
				System.out.println("Sorry! No more prizes.");
			}
			break;
			
		case 20:
			System.out.println("Congratulations! You win a laptop.");
			System.out.println("Enter an another integer number");
			luckyTwo = sc.nextInt();
			
			switch(luckyTwo) {													//INNER SWITCH WITHIN SECOND CASE
			case 23:
				System.out.println("Congratulations! You also win a Radio");
				break;
			case 25:
				System.out.println("Congratulations! You also win a Dining set.");
				break;
			default:
				System.out.println("Sorry! No more prizes.");
			}																	//END OF INNER SWITCH
		break;
		
		default:
			System.out.println("Sorry! Try again.");
		}

	}

}

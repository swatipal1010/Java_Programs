package random;
import java.util.Scanner;
import java.util.Random;

class Game{
	public int randomNumber;
	public int inputNumber;
	public int attempts;
	
	
	//Method to generate random number
	Game(){
		Random rand = new Random();
		randomNumber = rand.nextInt(100);
	}
	
	//Method to take the user input
	void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user input: ");
		inputNumber = sc.nextInt();
	}
	
	//Method to check the input number against the random number
	public static int flag = 1;
	void checkInputNumber() {
		attempts++;
		if(inputNumber==randomNumber) {
			System.out.println("Congratulations!!You guessed the right number.");
			System.out.println("You guessed the number in "+attempts+" attempts.");
			flag = 0;
		}
		else if(inputNumber>randomNumber) {
			System.out.println("You enetered too high number..");
		}else if(inputNumber<randomNumber) {
			System.out.println("You entered too low number..");
		}
	}
}


//Main method class
public class GuessNumber {

	public static void main(String[] args) {
		Game g = new Game();
		
		int test = Game.flag;
		while(test!=0){
			g.userInput();
			g.checkInputNumber();
			test = Game.flag;
		}
	}

}

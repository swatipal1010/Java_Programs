package MyPrep;
import java.util.Scanner;

public class DiceNumSumGame {

	public static void main(String[] args) {
		int sumA =0;
		int sumB= 0;
		int gameNumber =0;
		System.out.println("Let's start the game!");
		
		for(int i=0; i<2;i++) {
			gameNumber++;
			System.out.println();
			System.out.println("Game number: "+gameNumber);
			System.out.println("It's A's turn to play the game!");
			int n = (int)(10*Math.random())%6+1;
			sumA +=n;
			System.out.println("Points earned by A: "+sumA);
			
			System.out.println("It's B's turn to play the game!");
			int m = (int)(10*Math.random())%6+1;
			sumB += m;
			System.out.println("Points earned by B: "+sumB);
		}
		System.out.println();
			if(sumA>sumB) {
				System.out.println("Player A wins by "+(sumA-sumB)+" points.");
			}else
				System.out.println("Player B wins by "+(sumB-sumA)+" points.");

	}

}

package MyPrep;

public class GameCashInflow {

	public static void main(String[] args) {
		int gamenumber =1;
		int sumA = 0;
		int sumB = 0;
		for(int i=1; i<=5;i++) {
			System.out.println("Game Number: "+gamenumber);
			System.out.println("It's A's turn to play the game!!");
			int randomIntA = (int) (Math.random() * (1000 - 10 + 1) + 10);
			sumA  += randomIntA;
			System.out.println("Cash inflow to A's account: "+sumA);
			
			System.out.println();
			
			System.out.println("It's B's turn to play the game!!");
			int randomIntB = (int) (Math.random() * (1000 - 10 + 1) + 10);
			sumB += randomIntB;
			System.out.println("Cash inflow to B's account: "+sumB);
			gamenumber++;
			System.out.println();
			System.out.println();
			
		}
		if(sumA>sumB) {
			System.out.println("A has "+(sumA-sumB)+" more cash than B");
		}else {
			System.out.println("B has "+(sumB-sumA)+" more cash than A");
		}

	}

}

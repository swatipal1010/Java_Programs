package revision;

public class GameCashWinner {

	public static void main(String[] args) {
		int sumA = 0;
		int sumB = 0;
		int gameNumber = 0;
		
		for(int i =0; i<5; i++) {
			gameNumber++;
			System.out.println("Game Number : "+gameNumber);
			
			System.out.println("It's A turn to play the game ");
			int n = (int)(1000*Math.random())+1;
			sumA = sumA+n;
			
			System.out.println("Cash inflow to A: "+n);
			System.out.println("sumA "+sumA);
			
			System.out.println("It's B turn to play the game ");
			int m = (int)(1000*Math.random())+1;
			sumB = sumB+m;
			
			System.out.println("Cash inflow to B: "+m);
			System.out.println("sumB "+sumB);
		}
		
		if(sumA>sumB)
			System.out.println("A is winner with cash "+" "+sumA+" over B's cash"+" "+sumB);
		else
			System.out.println("B is winner with cash "+" "+sumB+" over A's cash"+" "+sumA);
	}

}

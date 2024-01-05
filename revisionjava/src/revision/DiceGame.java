package revision;

public class DiceGame {

	public static void main(String[] args) {
		int sumA = 0;
		int sumB = 0;
		int gameNumber = 0;
		
		
		System.out.println("Let us start the game");
		for(int i=0; i<2; i++) {
			gameNumber++;
			System.out.println("Game Number = "+ gameNumber);
			System.out.println("It's A turn to play");
			 int n = (int)(10*Math.random())%6 + 1;
			 sumA += n;
			 
			 System.out.println("Points earned by A = "+n);
			 System.out.println("sumA = "+sumA);
			 
			 System.out.println("It's now B turn to play");
			 int m = (int)(10*Math.random())%6+1;
			 sumB += m;
			 
			 System.out.println("Points earned by B = "+m);
			 System.out.println("sumB = "+sumB);
			 
			 System.out.println("***********************************");
			 
		}
		
		
		if(sumA>sumB)
			System.out.println("A is the winner with "+ sumA + " "+ " points over B's "+ sumB +" "+ "points");
		else
			System.out.println("B is the winner with " + sumB + " " +"points over A's "+ sumA +" " + "points");
	}

}

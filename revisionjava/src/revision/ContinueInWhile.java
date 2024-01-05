package revision;

public class ContinueInWhile {

	public static void main(String[] args) {
		int i =1;
		
		while(i<=10) {
			i++;
			if(i==5) {
				continue;
			}
			System.out.println("This is "+i+"st "+"iteration.");
			
		}

	}

}

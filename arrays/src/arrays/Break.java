package arrays;

public class Break {

	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			System.out.print("Pass " +i+ ":");
			for(int j =1; j<=20; j++) {
				if(j==11) break;
				System.out.print(j + " ");
				
			}
			System.out.println();
	      }
		  System.out.println("Loop complete.");
	}
}

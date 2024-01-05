package revision;
import java.util.Scanner;

public class DoWhileMenuSelection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		do {
			System.out.println("Help on!");
			System.out.println("1. if");
			System.out.println("2. switch");
			System.out.println("3. while");
			System.out.println("4. do-while");
			System.out.println("5. for");
			System.out.print("Choose one: ");
			a = sc.nextInt();
			
			switch(a) {
		    case 1 :
		    	System.out.println("You selected if.");
		    	break;
		    case 2 :
		    	System.out.println("You selected switch.");
		    	break;
		    case 3 :
		    	System.out.println("You selected while.");
		    	break;
		    case 4 :
		    	System.out.println("You selected do-while.");
		    	break;
		    case 5 :
		    	System.out.println("You selected for.");
		}
		}while(a<1 || a>5);
		System.out.println("\n");
		
	}
}

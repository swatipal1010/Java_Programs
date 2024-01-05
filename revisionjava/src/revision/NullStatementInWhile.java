package revision;
import java.util.Scanner;

public class NullStatementInWhile {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		i= sc.nextInt();
		System.out.print("Enter the second number: ");
		j = sc.nextInt();
		
		
		System.out.print("Midpoint between "+i+" and "+j+" is: "); //No body in this loop (Null statement)
		
		while(++i<--j);
		
		System.out.println(i);

	}

}

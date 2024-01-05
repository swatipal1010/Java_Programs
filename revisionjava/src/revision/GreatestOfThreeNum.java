package revision;
import java.util.Scanner;

public class GreatestOfThreeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		
		System.out.println("Enter the first number: ");
		int m = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the third number: ");
		int p = sc.nextInt();
		
		
		//METHOD-1
		/*max = (n>m?n:m)>p ? (n>m?n:m) : p;
		System.out.println("Greatest among "+" "+ m + " "+ n +" "+p+" "+"is: "+" "+ max); */
		
		
		//METHOD-2
		int maxNum;
		if(m>n)
			maxNum=m;
		else {
			if(n>p)
				maxNum=n;
			else
				maxNum=p;
		}
		
		System.out.println("The greatest number among "+ m +",  "+ n +" " + "and " +p+ " is: "+maxNum);
		

	}

}

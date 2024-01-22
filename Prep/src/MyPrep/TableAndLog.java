package MyPrep;
import java.util.Scanner;

public class TableAndLog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number whose table you want: ");
		int num = sc.nextInt();
		int mul =0;
		System.out.println("\t \t Log Calculation");
		for(int i=1;i<=10;i++) {
			mul = num*i;
			System.out.print(num+" * "+ i+" = "+mul+"\t \t");
			System.out.printf("%.3f \n", Math.log(mul));
		}

	}

}

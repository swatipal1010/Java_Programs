package basic_programs;
import java.util.Scanner;

public class PatternLeftTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		
		for (int i = 1; i <= rows; i++) {
            // Print spaces to align the stars to the left
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Inner loop to print the stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

	}

}

package basic_programs;
import java.util.Scanner;

public class PatternDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<rows-i-1; j++) 		// space in each row is row-i-1 for each row iteration 'i'
				System.out.print(" ");
			for(int k=0; k<2*i+1; k++) {		// * printed in each row is '2*i+1'
				System.out.print("*");
			}
			System.out.println();
		}

		
		// Lower half of the diamond
        for (int i=rows-2; i>=0; i--) {
            // Print spaces for left alignment
            for (int j = 0; j < rows-i-1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
	}

}

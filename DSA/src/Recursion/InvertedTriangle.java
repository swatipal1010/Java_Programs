package Recursion;

import java.util.Scanner;

public class InvertedTriangle {
	//METHOD 1
	public static void printTriangle(int row) {
		if(row==0) {
			return;
		}
		for(int i=0; i<row; i++) {
			System.out.print("* ");
		}
		System.out.println(" ");
		printTriangle(row-1);
	}
	
	//METHOD 2
	public static void printTri(int row, int col) {
		if(row==0) {
			return;
		}
		if(col<row) {
			System.out.print("* ");
			printTri(row,col+1);
		}else {
			System.out.println();
			printTri(row-1,0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		printTriangle(rows);
		System.out.println();
		printTri(rows,0);
		sc.close();
	}

}

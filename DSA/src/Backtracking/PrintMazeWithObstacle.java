package Backtracking;

import java.util.Scanner;

public class PrintMazeWithObstacle {
	public static void printWays(String processed, int row, int col, boolean[][] maze) {
		if(row==maze.length-1 && col==maze[0].length-1) {
			System.out.println(processed);
			return;
		}
		if(!maze[row][col]==false) {
			return;
		}
		if(row< maze.length-1) {
			printWays(processed+"D",row+1,col,maze);
		}
		if(col<maze[0].length-1) {
			printWays(processed+"R",row,col+1,maze);
		}
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number of rows and cols maze will have: ");
		int size = sc.nextInt();
		
		boolean[][] maze = new boolean[size][size];
		System.out.println("Enter the row index for the obstacle: ");
		int rowObsIndex = sc.nextInt();
		
		System.out.println("Enter the column index for the obstacle: ");
		int colObsIndex = sc.nextInt();
		
		maze[rowObsIndex][colObsIndex] = false;
		
		System.out.println("Ways to travel the maze from first cell to the last cell are: ");
		printWays("",0,0,maze);
		
		sc.close();

	}

}

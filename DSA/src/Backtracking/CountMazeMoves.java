package Backtracking;
import java.util.Scanner;

public class CountMazeMoves {
	
	public static int countWays(int[][] maze) {
		if(maze.length==1&& maze[0].length==1){
			return 1;
		}
		int ans = helper(maze,maze.length,maze[0].length);
		return ans;
	}
	public static int helper(int[][] maze, int row, int col) {
		if(row==1 || col==1) {
			return 1;
		}
		int count1 = helper(maze,row-1,col);
		int count2 = helper(maze,row,col-1);
		return count1+count2;
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number of rows and cols maze will have: ");
		int size = sc.nextInt();
		
		int[][] maze = new int[size][size];
		int totalWays = countWays(maze);
		System.out.println("Total number of ways to move from (0,0) to ("+size+","+size+") : "+totalWays);
		

	}

}

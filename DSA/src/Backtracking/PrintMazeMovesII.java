package Backtracking;
import java.util.ArrayList;
import java.util.Scanner;

//Program to print paths when right, down and diagonal moves are allowed to move from first cell to the last cell of the maze

public class PrintMazeMovesII {
	
	public static void printWays(String processed, int row, int col) {
		if(row==1 && col==1) {
			System.out.println(processed);
			return;
		}
		if(row>1) {
			printWays(processed+"D",row-1,col);
		}
		if(row>1 && col>1) {
			printWays(processed+"DR",row-1,col-1);
		}
		if(col>1) {
			printWays(processed+"R",row,col-1);
		}
	}
	
	public static ArrayList<String> pathReturn(String processed,int row, int col){
		if(row==1 && col==1) {
			ArrayList<String> path = new ArrayList<>();
			path.add(processed);
			return path;
		}
		ArrayList<String> list = new ArrayList<>();
		if(row>1) {
			list.addAll(pathReturn(processed+"D",row-1,col));
		}
		if(row>1 && col>1) {
			list.addAll(pathReturn(processed+"Diag",row-1,col-1));
		}
		if(col>1) {
			list.addAll(pathReturn(processed+"R",row,col-1));
		}
		return list;
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number of rows and cols maze will have: ");
		int size = sc.nextInt();
		
		System.out.println("Ways to travel the maze from first cell to the last cell are: ");
		printWays("",size,size);
		
		ArrayList<String> ansList = pathReturn("",size,size);
		System.out.println("All possible paths are: "+ansList);
		
		sc.close();

	}

}

package Backtracking;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintMazeMoves {
	
	public static void printWays(String processed,int row, int col) {
		if(row==1 && col==1) {
			System.out.println(processed);
			return;
		}
		if(row!=1) {
			printWays(processed+"D",row-1,col);
		}
		if(col!=1) {
			printWays(processed+"R",row,col-1);
		}
		
	}
	
	public static ArrayList<String> pathReturn(String processed, int row, int col){
		if(row==1 && col==1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(processed);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		if(row>1) {
			list.addAll(pathReturn(processed+"D", row-1, col));
		}
		if(col>1) {
			list.addAll(pathReturn(processed+"R", row, col-1));
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

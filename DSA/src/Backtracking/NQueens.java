package Backtracking;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class NQueens {
	
	static void nQueens(boolean[][] board, int row, List<List<String>> queenList) {
        if (row == board.length) {
            addQueen(board, queenList);
            return;  
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                nQueens(board, row + 1, queenList);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col){
        for(int i=0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }

        int maxLeft = Math.min(row,col);
        for(int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int maxRight = Math.min(row,board.length-col-1);
        for(int i=1; i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void addQueen(boolean[][] board, List<List<String>> queenList) {
        List<String> solution = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder queenRow = new StringBuilder();  
            for (boolean cell : row) {
                queenRow.append(cell ? 'Q' : '.');
            }
            solution.add(queenRow.toString());
        }
        queenList.add(solution);
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> queenList = new ArrayList<>();
        boolean[][] chess = new boolean[n][n];
        nQueens(chess, 0, queenList);
        return queenList;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the matrix: ");
		int n = sc.nextInt();
		
		List<List<String>> ansList = solveNQueens(n);
		System.out.println("Possible answers for queen placement within the given matrix: "+ansList);
		
		sc.close();
	}

}

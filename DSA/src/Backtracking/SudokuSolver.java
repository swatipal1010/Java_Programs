package Backtracking;
import java.util.Scanner;

class SudokuSolver {
	
	//Method to check if the digit being considered can be placed at the considered cell or not
    public static boolean isSafe(char[][] board, int row, int col, char dig) {
        for (int i = 0; i < 9; i++) {							//Check in the same row, different columns
            if (board[row][i] == dig) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {							//Check in same column, different rows
            if (board[i][col] == dig) {
                return false;
            }
        }

        // Check 3x3 subgrid
        int strtRow = (row / 3) * 3;							//Row index from where the grid starts
        int strtCol = (col / 3) * 3;							//Column index from where the grids starts
        for (int i = strtRow; i < strtRow + 3; i++) {
            for (int j = strtCol; j < strtCol + 3; j++) {
                if (board[i][j] == dig) {
                    return false;
                }
            }
        }
        return true;
    }

    
    //Method to solve sudoku
    public static boolean helper(char[][] board, int row, int col) {
        if (row == 9) {
            return true;
        }
        int nextRow = row, nextCol;
        if (col == 8) {
            nextRow = row + 1;
            nextCol = 0;
        } else {
            nextCol = col + 1;
        }

        if (board[row][col] != '.') {					//If there's no digit already placed in the cell, then only find the digit that can be placed
            return helper(board, nextRow, nextCol);
        }
        for (char dig = '1'; dig <= '9'; dig++) {			//Check which among the digit from 1 to 9 can be placed
            if (isSafe(board, row, col, dig)) {
                board[row][col] = dig;
                if (helper(board, nextRow, nextCol)) {
                    return true;
                }
                board[row][col] = '.';						//If wrong digit placed, remove the digit and fill it back with '.'
            }
        }
        return false;
    }

    
    public static void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    
    // Method to print Sudoku board
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[9][9];

        System.out.println("Enter the Sudoku puzzle row by row (use '.' for empty cells):");
        for (int i = 0; i < 9; i++) {
            String row = sc.next();
            for (int j = 0; j < 9; j++) {
                board[i][j] = row.charAt(j);
            }
        }
        solveSudoku(board);
        System.out.println("Solved Sudoku:");
        printBoard(board);
        
        sc.close();
    }      
}


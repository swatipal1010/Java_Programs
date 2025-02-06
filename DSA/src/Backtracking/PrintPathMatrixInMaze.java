package Backtracking;
import java.util.Scanner;
import java.util.Arrays;

public class PrintPathMatrixInMaze {
	
    public static void printPaths(String processed, int row, int col, boolean[][] maze, int[][] path, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step; 										// Mark last step
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }
        if (!maze[row][col]) {
            return;
        }

        // Mark this cell as visited
        maze[row][col] = false;
        path[row][col] = step;

        // Move Down
        if (row < maze.length - 1) {
            printPaths(processed + "D", row + 1, col, maze, path, step + 1);
        }

        // Move Right
        if (col < maze[0].length - 1) {
            printPaths(processed + "R", row, col + 1, maze, path, step + 1);
        }

        // Move Up
        if (row > 0) {
            printPaths(processed + "U", row - 1, col, maze, path, step + 1);
        }

        // Move Left
        if (col > 0) {
            printPaths(processed + "L", row, col - 1, maze, path, step + 1);
        }

        // Backtrack: Unmark the current cell
        maze[row][col] = true;
        path[row][col] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and cols for the maze: ");
        int size = sc.nextInt();

        // Initialize a maze where all cells are open (true)
        boolean[][] maze = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(maze[i], true);
        }
        
        int[][] path = new int[size][size];

        if (!maze[0][0]) {
            System.out.println("No path available from the starting position.");
        } else {
            System.out.println("Possible paths through the maze:");
            printPaths("", 0, 0, maze, path, 1);
        }

        sc.close();
    }
}

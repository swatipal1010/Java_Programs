package Backtracking;

import java.util.Scanner;

public class PrintMazeAllDirections {

    public static void printPaths(String processed, int row, int col, boolean[][] maze) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(processed);
            return;
        }

        // If the cell is already visited, return
        if (maze[row][col] == false) {
            return;
        }

        //Considering this block in my path. Mark the cell as visited.
        maze[row][col] = false;

        // Move Down
        if (row < maze.length - 1) {
            printPaths(processed + "D", row + 1, col, maze);
        }

        // Move Right
        if (col < maze[0].length - 1) {
            printPaths(processed + "R", row, col + 1, maze);
        }

        // Move Up
        if (row > 0) {
            printPaths(processed + "U", row - 1, col, maze);
        }

        // Move Left
        if (col > 0) {
            printPaths(processed + "L", row, col - 1, maze);
        }

      //This line is where the function will be over
      //so before the function gets removed, also remove also remove the changes made by that function
        maze[row][col] = true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and cols for the maze: ");
        int size = sc.nextInt();

        // Initialize a maze where all cells are open (true)
        boolean[][] maze = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                maze[i][j] = true;
            }
        }

        if (!maze[0][0]) {
            System.out.println("No path available from the starting position.");
        } else {
            System.out.println("Possible paths through the maze:");
            printPaths("", 0, 0, maze);
        }

        sc.close(); 
    }
}

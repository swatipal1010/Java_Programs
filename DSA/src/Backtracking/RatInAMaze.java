package Backtracking;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class RatInAMaze {

    public static void ratPaths(int[][] maze, int row, int col, String processed, List<String> paths) {
        // Base case: If we reach the destination, add the path and return
        if (row == maze.length - 1 && col == maze.length - 1) {
            paths.add(processed);
            return;
        }

        // If the cell is blocked (0) or already visited (-1), return
        if (maze[row][col] == 0 || maze[row][col] == -1) {
            return;
        }

        // Mark the visited cell as -1
        maze[row][col] = -1;  // Mark as visited

        // Move Down
        if (row < maze.length - 1) {
            ratPaths(maze, row + 1, col, processed + "D", paths);
        }

        // Move Right
        if (col < maze[0].length - 1) {
            ratPaths(maze, row, col + 1, processed + "R", paths);
        }

        // Move Up
        if (row > 0) {
            ratPaths(maze, row - 1, col, processed + "U", paths);
        }

        // Move Left
        if (col > 0) {
            ratPaths(maze, row, col - 1, processed + "L", paths);
        }

        //backtracking
        maze[row][col] = 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the maze: ");
        int n = sc.nextInt();
        int[][] maze = new int[n][n];

        System.out.println("Enter 0 and 1 in the maze: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        System.out.println("Maze is: ");
        for (int[] row : maze) {
            System.out.println(Arrays.toString(row));
        }

        // Check if the start is blocked
        if (maze[0][0] == 0) {
            System.out.println("No paths possible as the starting position is blocked.");
            return;
        }

        List<String> paths = new ArrayList<>();
        ratPaths(maze, 0, 0, "", paths);
        System.out.println("Possible paths are: " + paths);
    }
}

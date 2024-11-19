package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class PeakElementMatrix {
    
	public static int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int startCol = 0;
        int endCol = cols - 1;

        while (startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;
            int maxRow = 0;

            // Find the maximum element in the middle column
            for (int i = 0; i < rows; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            // Check if the maximum element is a peak
            boolean isLeftSmaller = (midCol == 0) || (mat[maxRow][midCol] > mat[maxRow][midCol - 1]);
            boolean isRightSmaller = (midCol == cols - 1) || (mat[maxRow][midCol] > mat[maxRow][midCol + 1]);

            if (isLeftSmaller && isRightSmaller) {
                return new int[]{maxRow, midCol}; // Found a peak
            }

            // Move to the direction of the larger neighbor
            if (midCol > 0 && mat[maxRow][midCol - 1] > mat[maxRow][midCol]) {
                endCol = midCol - 1; // Move left
            } else {
                startCol = midCol + 1; // Move right
            }
        }

        return new int[]{-1, -1}; // No peak found (edge case, unlikely due to problem constraints)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter " + cols + " elements in row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matrix is: " + Arrays.deepToString(matrix));
        
        int peak[] = findPeakGrid(matrix);
        
        if (peak[0] != -1 && peak[1]!=-1) {
            System.out.println("Peak element in the matrix is: " + Arrays.toString(peak));
        } else {
            System.out.println("No peak element found in the matrix.");
        }
        
        sc.close();
    }
}

package Arrays;
import java.util.Scanner;
import java.util.Arrays;


public class TargetInSortedMatrix {
	
	public static int[] findTarget(int[][] matrix, int target) {
		int r = 0;
		int col = matrix[0].length-1;
		
		while(r<matrix.length && col>=0) {
			if(matrix[r][col]==target) {
				return new int[]{r,col};
			}else if(matrix[r][col]<target){
				r++;
			}else {
				col--;;
			}
		}
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int columns = sc.nextInt();
		
		int matrix[][] = new int[rows][columns];
		
		System.out.println("Start entering the elements: ");
		for(int i=0; i<rows; i++) {
			System.out.println("Enter "+columns+" elements in row"+(i+1)+" in sorted order: ");
			for(int j=0; j<columns; j++) {
				matrix[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Matrix is: "+Arrays.deepToString(matrix));
		
		System.out.println("Enter the target element from the matrix: ");
		int target = sc.nextInt();
		
		int[] index = findTarget(matrix, target);
		
		System.out.println("Target element "+target+" liest at index: "+Arrays.toString(index));
		
		sc.close();
	}

}

package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class TransposeMatrix {
	
	//Transposing a square matrix (In-pace operation)
	public static void transpose(int[][] matrix) {
		int n = matrix.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(i!=j) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}			
			}
		}
	}
	
	//Method to reverse the rows of the transposed matrix
	public static void revRows(int[][] matrix) {
		int n = matrix.length;
		
		for(int i=0; i<n; i++) {
			int start = 0; 
			int end = n-1;
			while(start<end) {
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows/columns of square matrix: ");
		int size = sc.nextInt();
		
		int[][] matrix = new int[size][size];
		System.out.println("Enter the elements into the matrix: ");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print("matrix["+i+"]["+j+"] = ");
				matrix[i][j] = sc.nextInt();
				//System.out.println();
			}
		}
		System.out.println("Matrix is: "+Arrays.deepToString(matrix));
		
		transpose(matrix);
		System.out.println("Matrix after transpose: "+Arrays.deepToString(matrix));
		
		revRows(matrix);
		System.out.println("Transposed matrix after reversing elements of each of its rows is: "+Arrays.deepToString(matrix));

	}

}

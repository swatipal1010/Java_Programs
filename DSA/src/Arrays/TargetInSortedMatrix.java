package Arrays;
import java.util.Scanner;
import java.util.Arrays;


public class TargetInSortedMatrix {
	
	
	//METHOD-1 Time Complexity = O(m+n) where m is the no. of rows and n is the no. of columns
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
	
	
	//METHOD-2 Time Complexity = O(m*logn). Applying Binary Search on each row of the matrix to find the element
	public static int[] findTarget2(int[][] matrix, int target) {
	    for (int i = 0; i < matrix.length; i++) {
	        int start = 0; 
	        int end = matrix[0].length - 1; 
	        while (start <= end) { 
	            int mid = start + (end - start) / 2;
	            if (matrix[i][mid] == target) {
	                return new int[] { i, mid };
	            } else if (matrix[i][mid] < target) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }
	    }
	    return new int[] { -1, -1 }; 
	}

	
	//METHOD-3 Time Complexity = O(m+logn). Checking if element can lie in a row. If yes, apply Binary Search.
	public static int[] binarySearch(int[] row, int target, int i) {
		int start = 0;
		int end = row.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(row[mid]==target) {
				return new int[]{i, mid};
			}else if(row[mid]>target) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return new int[]{-1,-1};
	}
	
	public static int[] findTarget3(int[][] matrix, int target) {
	    for (int i = 0; i < matrix.length; i++) {
	        if (matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target) {
	            return binarySearch(matrix[i], target, i);
	        }
	    }
	    return new int[] { -1, -1 }; 
	}
	
	
	//METHOD-4 Time Complexity = O(logm+logn). We find the suitable row  using Binary Search that contains the target element and then apply Binary Search on that row.
	public static int[] findTarget4(int[][] matrix, int target) {
		int totalRows = matrix.length;
		int totalCols = matrix[0].length;
		int start = 0;
		int end = totalRows-1;
		
		int ans[] = new int[2];
		Arrays.fill(ans, -1);
		
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(matrix[mid][totalCols-1]<target){		//If the target element is greatest than the last elem of a row, then start searching from next row
				start = mid+1;
			}else if(matrix[mid][0]>target) {			//If the target ele is less than 1st elem of a row, start searching from rows above it
				end = mid-1;
			}else {										//If target<=less than last elem of a row and target>=1st elem of a row, target lies in the considered row
				return binarySearch(matrix[mid], target,  mid);
			}
		}
			return ans;
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
		
		int[] index = findTarget4(matrix, target);
		
		System.out.println("Target element "+target+" lies at at index: "+Arrays.toString(index));
		
		sc.close();
	}

}

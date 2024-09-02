package BitManipulation;

import java.util.Scanner;

public class FlipAndInvertMatrix {
	
	//Method to invert the matrix horizontally(reverse each row) and then invert it(convert 0 to 1 and vice-versa)
	public static void matrixOpr(int[][] arr){
		for(int[] nums: arr) {
			for(int i=0; i<(arr[0].length+1)/2; i++) {
				int temp = nums[i]^1;					//Element of each row being reversed
				nums[i] = nums[arr[0].length-1-i]^1;	//Element being reversed and swapped
				nums[arr[0].length-1-i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of rows of the 2D array: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns of the 2D array: ");
		int col = sc.nextInt();
		
		int[][] arr = new int[rows][col];
		
		System.out.println("Enter "+col+" elements each in "+rows+" rows of the 2D array: ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Elements in the array are: ");
		for(int row[]: arr) {
			for(int val: row) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
		System.out.println("Elements in the array afetr flipping it horizontally and reversing the elements: ");
		matrixOpr(arr);
		for(int row[]: arr) {
			for(int val: row) {
				System.out.print(val+" ");
			}
			System.out.println();
		}

	}

}

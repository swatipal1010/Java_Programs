package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class RangeAddition {
	public static void rangeAdd(int[] arr, int[][] queries) {
		int n = arr.length;
		
		for(int[] query: queries) {
			int start = query[0];
			int end = query[1];
			int x = query[2];
			
			arr[start] += x;
			if(end<n-1) {
				arr[end+1] -= x;
			}
		}
		
		int sum =0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
			arr[i] = sum;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		Arrays.fill(arr,0);
		
		System.out.println("Enter the number of queries you will have: "); //Each query consist of start index, end index and value to add in that range of index of array
		int queryNums = sc.nextInt();
		int[][] queries = new int[queryNums][3];
		
		for(int i=0; i<queries.length; i++) {
			System.out.println("Enter Query"+(i+1));
			for(int j=0; j<3; j++) {
				if(j==0) {
					System.out.println("Enter the start index: ");
					queries[i][j] = sc.nextInt();
				}
				else if(j==1) {
					System.out.println("Enter the end index: ");
					queries[i][j] = sc.nextInt();
				}
				else {
					System.out.println("Enter the value to be added in the index range: ");
					queries[i][j] = sc.nextInt();
				}
			}
		}
		
		System.out.println("Array of queries is: "+Arrays.deepToString(queries));
		
		rangeAdd(arr,queries);
		System.out.println("Array after applying the queries to its range of indices: "+Arrays.toString(arr));

	}

}

package Arrays;
import java.util.Arrays;

public class ElementIn2DArray {
	
	static int[] targetIndex(int arr[][], int target) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]== target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		int arr[][] = {
				{23,4,1},
				{18,12,3,9},
				{78,99,36,44},
				{18,12}
		};
		
		int target = 36;
		
		int index[] = targetIndex(arr, target);
		System.out.println("Target element "+target+" lies at index: "+Arrays.toString(index));

	}

}

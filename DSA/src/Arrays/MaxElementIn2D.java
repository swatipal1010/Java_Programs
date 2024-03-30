package Arrays;

public class MaxElementIn2D {
	
	static int max(int arr[][]) {
		int maxElement = arr[0][0];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]>maxElement) {
					maxElement = arr[i][j];
				}
			}
		}
		return maxElement;
	}
	
	public static void main(String[] args) {
		int arr[][] = {
				{23,4,1},
				{18,12,3,9},
				{78,99,36,44},
				{18,12}
		};
		
		int result = max(arr);
		System.out.println("Maximum element in the array is: "+result);

	}

}

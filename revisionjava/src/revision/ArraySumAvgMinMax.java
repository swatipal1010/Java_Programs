package revision;
import java.util.Scanner; 

public class ArraySumAvgMinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr3[] = new int[10];
		int n = arr3.length;
		
		System.out.println("Enter the elemnts of the array: ");
		for(int i =0; i<n; i++)
		{
			arr3[i] = sc.nextInt();
		}
		
		int sum =0;
		for(int j=0; j<n; j++) {
			sum = sum+arr3[j];
		}
		System.out.println("Sum of the array is: "+sum);
		
		System.out.println("Average of the entered numbers is: "+ (sum/n));
		
		int min = arr3[0];
		for(int k=0; k<n; k++) {
			if(arr3[k]<min) {
				min = arr3[k];
		    }
	    }
		System.out.println("The minimum value in the array is: "+min);
		 int max = arr3[0];
		 for(int m=0; m<n; m++) {
			 if(arr3[m]>m) {
				 max = arr3[m];
			 }
		 }
		 System.out.println("The maximum value in the array is: "+max);
  }
}

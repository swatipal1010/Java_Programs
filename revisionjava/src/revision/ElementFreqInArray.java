package revision;
import java.util.Scanner;

public class ElementFreqInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int a = sc.nextInt();
		int array[] = new int[a];
		int occurances[] = new int[a];
		
		System.out.println("Enter the elements in the array: ");
		for(int i=0; i<a; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("Elements in the array are: ");
		for(int j=0; j<a; j++) {
			System.out.print(array[j]+" ");
			
		}
		System.out.println();
		
		int visited = -1;   // If the element has been already visited(counted), it is marked as -1
		for(int i=0; i<a; i++) {
			int count =1;					//Each element of the array itself counts to 1 when it is encountered for the 1st time in the array
			for(int j=i+1; j<a; j++) {		//We start to match the value next to the value(next index) we have considered
				if(array[i]==array[j]) {	//If the value at the (i+1)th index i.e. jth index, is equal to the value to the ith index, 
					count++;				//we increment the value of count variable by one.
					occurances[j] = visited;//Counted values in the array are marked as -1, 
				}							//so to never them again(avoids duplicate counting)
			}
			if(occurances[i]!=visited) {
				occurances[i] = count;
			}
		}
		
		for(int i=0;i<a;i++) {
			if(occurances[i]!= visited)
				System.out.println("Frequency of "+array[i]+" : "+occurances[i]);
		}
	}

}

package Recursion;
import java.util.Scanner;

public class CountSubsetsWithSumK {
	public static int subsequence(int arr[],int index, int sum,int currentSum) {
		if(index==arr.length) {
			return (currentSum == sum) ? 1 : 0;
		}
		//Pick array element
		int count1 = subsequence(arr,index+1,sum,currentSum+arr[index]); 	
		
		//Don't pick array element
		int count2 = subsequence(arr,index+1,sum,currentSum);
		
		return count1+count2;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " elements into the array: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of sum that should be equal to the sum of digits in subset: ");
        int sum = sc.nextInt();
        
        int ansCount = subsequence(arr, 0, sum, 0);
        System.out.println("Number of subsets whose sum of digits is equal to the given sum: "+ansCount);
        
        sc.close();
	}

}

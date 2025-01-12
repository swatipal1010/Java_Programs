package Sorting;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicates {

	public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }	
	
	public static ArrayList<Integer> findAllDup(int[] arr){
		ArrayList<Integer> ans = new ArrayList<>();
		
		int i = 0;
		while(i<arr.length) {
			int correctIndex = arr[i]-1;
			if(arr[i]!=arr[correctIndex]) {
				swap(arr,i,correctIndex);
			}else {
				i++;
			}
		}
		for(int j=0; j<arr.length; j++) {
			if(arr[j]!=j+1) {
				ans.add(arr[j]);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();
        
        int[] arr = new int[N];
        System.out.println("Enter " + N + " numbers into the array in the range 1 to " + N+". Also add the duplicate numbers as well.");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array is: " + Arrays.toString(arr));
        ArrayList<Integer> ans = findAllDup(arr);
        System.out.println("All the duplicate elements are: "+ans);
        sc.close();
	}

}

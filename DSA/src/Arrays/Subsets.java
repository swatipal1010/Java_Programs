package Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {

	public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();					//Creates the outer list that will store all subsets (initially empty).
        outer.add(new ArrayList<>());									//Adds an empty subset ([]) to the outer list
        
        //for loop iterates over each number in the input array arr. 
        //For each number, it generates new subsets by adding that number to each existing subset in outer
        for(int num: arr){
            int n = outer.size();
            for(int i=0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array whose subsequences you want to find: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array is: "+Arrays.toString(arr));
		
		List<List<Integer>> ansList = subsets(arr);
		System.out.println("Subsequences of tha array are: "+ansList);
		
		sc.close();
	}

}

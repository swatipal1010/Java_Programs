package Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsequenceSumEqualsK {
	public static void subsequenceSumK(int[] arr, List<Integer> list, int index, int sum) {
        // Base case: If we have processed all elements
        if (index >= arr.length) {
            if (!list.isEmpty() && getDigitSum(list) == sum) {
                System.out.println(list);
            }
            return;
        }

        // Include the current element
        list.add(arr[index]);
        subsequenceSumK(arr, list, index + 1, sum);

        // Exclude the current element (backtrack)
        list.remove(list.size() - 1);
        subsequenceSumK(arr, list, index + 1, sum);
    }

    // Function to calculate sum of digits of all elements in the list
	public static int getDigitSum(List<Integer> list) {
	    int digitsSum = 0;
	    for (int element : list) {  
	        digitsSum += element;  
	    }
	    return digitsSum;
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
        System.out.println("Enter the value of sum that you want subsequence must have: ");
        int sum = sc.nextInt();
        
        List<Integer> list = new ArrayList<>();
        subsequenceSumK(arr, list, 0,sum);
        sc.close();

	}

}

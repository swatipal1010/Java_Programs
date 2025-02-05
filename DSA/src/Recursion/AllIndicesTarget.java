package Recursion;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AllIndicesTarget {
	
    public static void allIndices(int[] arr, int index, int target, List<Integer> ansList) {
        if (index == arr.length) {  
            return;
        }
        if (arr[index] == target) { 
            ansList.add(index);
        }
        allIndices(arr, index + 1, target, ansList);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(arr));
        
        System.out.println("Enter the element of the array whose indices you want to find: ");
        int target = sc.nextInt();
        
        List<Integer> ansList = new ArrayList<>();
        allIndices(arr, 0, target, ansList);
        
        System.out.println("Indices of the target element in the array are: " + ansList);
        
        sc.close();
    }
}

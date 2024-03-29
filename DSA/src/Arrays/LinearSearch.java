package Arrays;
import java.util.Scanner;

public class LinearSearch {

	static int linearSearch(int arr[], int target) {
		if(arr.length==0) {
			return -1;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter the size of the array: ");
        size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements in the array are: ");
        for (int x : arr) {
            System.out.println(x);
        }
        
        System.out.println("Enter the target value you want to serach for in the array: ");
        int target = sc.nextInt();
        
        int index = linearSearch(arr, target);
        
        if(index!=-1) {
        	System.out.println(target+" is found at "+index+" index");
        }else {
        	System.out.println("Element not found.");
        }

	}

}

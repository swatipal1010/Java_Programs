package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateZeroes {
	
	public static void insert(int[] arr, int i, int j){
        if(j<arr.length){
            arr[j]=arr[i];
        }
    }
    public static void duplicateZeros(int[] arr) {
     int z = 0;
     for(int x :arr){
        if(x==0){
            z++;
        }
     }
     int i = arr.length-1;
     int j = arr.length+z-1;
     while(i!=j){
        insert(arr, i, j);
        j--;
        if(arr[i]==0){
            insert(arr, i, j);
            j--;
        }
        i--;
     }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter "+size+" elements in the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		duplicateZeros(arr);
		System.out.println("Resulant array is: "+Arrays.toString(arr));
		
	}

}

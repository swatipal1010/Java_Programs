package BitManipulation;

import java.util.Scanner;

public class UniqueNumber {

	//Given an array where each element is repeated twice except for one element, find the unique element
	public static int uniqueElementI(int[] arr) {
		int num =0;
		for(int i=0; i<arr.length; i++) {
			num = num^arr[i];
		}
		return num;
	}
	
	//Given an array where each element is repeated thrice except 1 number. Find that unique number
	public static int uniqueElementII(int[] arr) {
		int maxBitLength = 0;			//Length of array that stores the count of set bit at each index for all numbers
		for(int num : arr) {
			maxBitLength = Math.max(maxBitLength, Integer.toBinaryString(num).length());
		}
		
		int[] setBitCount = new int[maxBitLength];
		
		for(int num: arr) {
			for(int i=0; i<maxBitLength; i++) {
				if ((num & (1 << i)) != 0) {
                    setBitCount[i]++;
                }
			}
		}
		
		for(int i=0; i<maxBitLength; i++) {
			setBitCount[i]%=3;
		}
		
		int decimalValue = 0;  
        int n = setBitCount.length;  

        for (int i = 0; i < n; i++) {
            decimalValue = decimalValue * 2 + setBitCount[i];
        }
		
        return decimalValue;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size(of the form 3n+1) of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements in the array where each element should repeat thrice except 1 number: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}	
		System.out.println("Unique element in the array is: "+uniqueElementII(arr));
		
		
		System.out.println("Enter the size(of the form 2n+1) of the array: ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		
		System.out.println("Enter "+size2+" elements in the array where each element should repeat twice except 1 number: ");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Unique element in the array is: "+uniqueElementI(arr2));

	}

}

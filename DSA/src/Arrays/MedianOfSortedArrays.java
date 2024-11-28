package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfSortedArrays {
	
	public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;

        if (n > m) {
            return findMedianSortedArrays(arr2, arr1);
        }
        
        int low = 0, high = n;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = (n + m + 1) / 2 - mid1;

            int l1 = (mid1 == 0 ? Integer.MIN_VALUE : arr1[mid1 - 1]);
            int r1 = (mid1 == n ? Integer.MAX_VALUE : arr1[mid1]);

            int l2 = (mid2 == 0 ? Integer.MIN_VALUE : arr2[mid2 - 1]);
            int r2 = (mid2 == m ? Integer.MAX_VALUE : arr2[mid2]);

            if (l1 <= r2 && l2 <= r1) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } 
                else {
                    return Math.max(l1, l2);
                }
            }
            if (l1 > r2) {
                high = mid1 - 1;
            } 
            else {
                low = mid1 + 1;
            }
        }
        
        return 0;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array: ");
		int size1 = sc.nextInt();
		
		int[] arr1 = new int[size1];
		System.out.println("Enter "+size1+" elements in first array in sorted order: ");
		for(int i=0; i<size1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("First Array is : "+Arrays.toString(arr1));
		
		System.out.println("Enter the size of the first array: ");
		int size2 = sc.nextInt();
		
		int[] arr2 = new int[size2];
		System.out.println("Enter "+size2+" elements in second array in sorted order: ");
		for(int i=0; i<size2; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Second Array is : "+Arrays.toString(arr2));
		
		
		double ans = findMedianSortedArrays(arr1,arr2);
		System.out.println("Median of the above two arrays is: "+ans);
	}

}

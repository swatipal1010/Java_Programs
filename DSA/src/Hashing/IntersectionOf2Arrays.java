package Hashing;
import java.util.*;

public class IntersectionOf2Arrays {
	public static int[] intersection(int[] nums1, int[] nums2) {
		//Using set to store all the unique elements from the set1
		HashSet<Integer> set1 = new HashSet<>();
		
		for(int i=0; i<nums1.length; i++) {
			set1.add(nums1[i]);					//add unique elements only to the hashset
		}
		
		//Creating another set that stores the intersection of the two arrays
		HashSet<Integer> set2 = new HashSet<>();
		for(int nums: nums2) {
			if(set1.contains(nums)) {
				set2.add(nums);
			}
		}
		
		//Storing the intersection values from set2 to an array
		int[] result = new int[set2.size()];
		int i=0;
		for(int val : set2) {
			result[i++] = val;
		}
		return result;		
				
	}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of nums1 array: ");
		int l1 = sc.nextInt();
		int[] nums1 = new int[l1];
		System.out.println("Enter the elements in the array nums1: ");
		for(int i=0; i<l1;i++) {
			nums1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the size of nums2 array: ");
		int l2 = sc.nextInt();
		int[] nums2 = new int[l2];
		System.out.println("Enter the elements in num2 array: ");
		for(int i=0; i<l2; i++) {
			nums2[i] = sc.nextInt();
		}
		
		int result[] = intersection(nums1, nums2);
		System.out.println("Intersection elements from array nums1 and nums2 are: ");
		for(int num: result) {
			System.out.println(num);
		}

	}

}

package Hashing;
import java.util.*;

public class UnionOf2Arrays {
	
	//method-1 Using HashSet
	public static int doUnion(int a[], int b[]) {
		int l1 = a.length;
		int l2 = b.length;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<l1; i++) {
			set.add(a[i]);
		}
		for(int i=0; i<l2; i++) {
			set.add(b[i]);
		}
		
		return set.size();
	}
	
	
	//Method-2 Iterating through the arrays
	public static int[] doUnion2(int[] nums1, int[] nums2) {
		List<Integer> resultList = new ArrayList<>();
	    
	    for (int num : nums1) {
	        if (!resultList.contains(num)) {
	            resultList.add(num);
	        }
	    }
	    
	    for (int num : nums2) {
	        if (!resultList.contains(num)) {
	            resultList.add(num);
	        }
	    }
	    
	    int[] result = new int[resultList.size()];
	    for (int i = 0; i < resultList.size(); i++) {
	        result[i] = resultList.get(i);
	    }
	    
	    return result;
	}
	
	
	public static void main(String[] args) {
		int[] a = {1,1,2,3,4,2};
		int b[] = {3,5,2,2,9};
		
		System.out.println("Union of the elements is: ");
		int[] arr = doUnion2(a,b);
		for(int val: arr) {
			System.out.print(val+" ");
		}
		System.out.println();
		int count = doUnion(a,b);
		System.out.println("Union of array a and b contains: "+count+" elments.");		//1 2 3 4 5 9
		

	}

}

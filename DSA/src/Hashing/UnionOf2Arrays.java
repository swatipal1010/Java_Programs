package Hashing;
import java.util.*;

public class UnionOf2Arrays {
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
	
	public static void main(String[] args) {
		int[] a = {1,1,2,3,4,2};
		int b[] = {3,5,2,2,9};
		
		int count = doUnion(a,b);
		System.out.println("Union of array a and b contains: "+count+" elments.");		//1 2 3 4 5 9

	}

}

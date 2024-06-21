package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasics {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		//adding elements to the hashset
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);		//Since hashset contains unique elements only, only 1 copy of '2' will be stored
		
		//print all elements
		System.out.println(set);
		
		//check element is present or not
		if(set.contains(1)) {
			System.out.println("Contains element 1");
		}
		
		if(set.contains(5)) {
			System.out.println("Contains element 5");
		}else {
			System.out.println("Doesn't contains element 5.");
		}
		
		//Removing an element
		set.remove(3);
		System.out.println(set);
		
		if(!set.contains(3)) {
			System.out.println("Element 3 has been removed");
		}
		
		//Iterator creation to traverse the hashset
		Iterator it = set.iterator();
		System.out.println("Elements in the hash set are: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

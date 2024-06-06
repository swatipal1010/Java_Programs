package collections;
import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		
		//add() method is used to add the elements to the ArrayList
		for(int i=0; i<3; i++) {
			l1.add(i+4);
		}
		l1.add(6,7);						//Add an element 7 at index 6
		
		
		
		//print the elements in the arraylist
		System.out.println(l1);
		
		for(int list : l1) {
			System.out.println(list);
		}
		
		
		
		//size() method is used to know the size of the Arraylist
		System.out.println("Size of arraylist l1 is: "+l1.size());
		
		
		
		//get() method is used to retrieve the element based on index
		System.out.println(l1.get(2));
		
		
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Hello");
		l2.add("World");
		
		
		
		//Adding arraylist l2 to arraylist l1
		l1.addAll(l2);
		
	}
}

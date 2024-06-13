package LinkedList;
import java.util.*;

public class ReverseLinkedList {

	public static void reverseLinkedList(LinkedList<String> list) {
        // Two pointers approach
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            // Swap elements at start and end
            String temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            // Move pointers towards the center
            start++;
            end--;
        }
	}
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.push("I");					//adds at the beginning		
		list.addLast("am");
		list.addLast("going");
		list.addLast("to");
		list.addLast("London");
		list.offerFirst("Hey!");		//adds at the beginning
		list.offer("tomorrow");			//adds at the end
		
		System.out.println(list);
		
		//To reverse a linked list
		reverseLinkedList(list);

        System.out.println("Reversed LinkedList: " + list);
		
	}

}

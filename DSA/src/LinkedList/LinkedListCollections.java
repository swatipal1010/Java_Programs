package LinkedList;
import java.util.*;


public class LinkedListCollections {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> list = new LinkedList<>();
		
		list.addFirst("beautiful");
		list.addFirst("is");
		list.addFirst("Swati");
		
		list.addLast("girl");
		
		System.out.println(list);
		System.out.println("Size of the existing linked list is: "+list.size());
		
		System.out.println("Retrieving the elements of the linked list: ");
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i));
			System.out.print(" -> ");
		}
		System.out.println("null");
		
		//To add a node at a particular index in the linked list
		list.add(2, "a");
		System.out.println("Linked list  after adding a node at index 2 containing value \'"+list.get(2)+"\' is: "+list);
		
		//To add a arrayList collection to the already existing linked list
		Collection<String> arrayL = new ArrayList<>();
		arrayL.add("I");								//Always add the node at end
		arrayL.add("love");
		arrayL.add("programming");
		System.out.println("ArrayList is: "+arrayL);
				
		list.addAll(arrayL);			//ArrayList is appended at the end of the linked list. Use AddAll(index, Collection) to add a particular index
		System.out.println("New linked list after addition of ArrayList collection to it: "+list);
		
		System.out.println("Enter a value to be searched for in the linked list: ");
		String val = sc.nextLine();
		System.out.println("Does the linked list contains the value \""+val+"\"? "+list.contains(val)+" and it's index is: "+list.indexOf(val));
		
		//To find the first and last element of the linked list
		System.out.println("First element of the linked list is: "+list.getFirst());
		System.out.println("Last element of the linked list is: "+list.getLast());
		
		//To find the index of a particular element of the Linked List
		System.out.println("Enter the value whose index who want to find from this linked list: "+list);
		String findInd = sc.nextLine();
		
		System.out.println("Index of "+findInd+" is: "+list.indexOf(findInd));
		
		
		//Creating a list Iterator for the given linked list
		ListIterator<String> list_itr = list.listIterator(3);		//Starting the list iterator from index 3
		System.out.println("Values in the list iterator are: ");
		while(list_itr.hasNext()) {
			System.out.println(list_itr.next());
		}
		
		//To remove the first element of the linked list
		System.out.println("Linked list before removing the element from it: "+list);
		System.out.println("Node containing value \'"+list.poll()+"\' is removed from linked list");																		//list.pollFirst()and remove() also does the same job
		System.out.println("Liked list after removing the first element from it: "+list);	
		
		//To remove the last element from the linked list
		list.pollLast();
		System.out.println("Linked list after removing the last element from it: "+list);
		
		System.out.println("Performing the pop operation on the list: "+list+" gives: "+list.pop());
		System.out.println("Linked list is: "+list);
		
		//Convert a linked list to an array
		Object arr [] = list.toArray();											//Using toArray() method without the parameter
		System.out.println("Array obtained from the linked list is: ");
		for(Object x : arr) {
			System.out.println(x);
		}
		
		
		String myArray[] = new String[list.size()];
		list.toArray(myArray);													//Using toArray() method with a parameter
		System.out.println("Elements in the array obtained from the linked list is: ");
		for(String x: myArray) {
			System.out.println(x);
		}
		
		//To change the value of the node after it has been created
		list.set(4, "like");
		System.out.println("Updated linked list is: "+list);
	}

}

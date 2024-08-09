package LinkedList;
import java.util.Scanner;

public class RemoveKeyOccurences {

	Node head;
    Node tail;

    class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Method to create a doubly linked list
    public void createDLL() {
        System.out.println("Enter the number of nodes you want to create: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        if (size == 0) {
            System.out.println("You decided to create no node.");
            return;
        }

        System.out.println("Enter the value in the head node: ");
        int headVal = sc.nextInt();
        head = new Node(headVal);
        tail = head; // Initialize tail as the head initially

        Node temp = head;
        for (int i = 1; i < size; i++) {
            System.out.println("Enter the value in the " + (i + 1) + "th node: ");
            int value = sc.nextInt();
            Node newNode = new Node(value);
            temp.next = newNode;
            newNode.prev = temp;
            temp = temp.next;
        }
        tail = temp; // Update the tail to the last node
    }

    // Method to print the doubly linked list
    public void printDLL(Node head) {
        Node temp = head;
        if (temp == null) {
            System.out.println("null");
            return;
        }

        System.out.print("null <- ");
        while (temp != null) {
        	if(temp.next==null) {
        		System.out.print(temp.val+" ->");
        	}else {
        		System.out.print(temp.val + " <-> ");
        	}
            temp = temp.next;
        }
        System.out.println(" null");
    }
    
    //Method to delete all occurances of a key 'x' from the DLL
    public Node deleteAllOccurOfX(Node head, int x) {
        if (head == null) return null;

        Node current = head;
        
        // Traverse the list and delete nodes with value x
        while (current != null) {
            if (current.val == x) {
                // Node to be deleted is the head
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    current.prev.next = current.next;
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                }
            }
            current = current.next;
        }      
        return head;
    }
	
	public static void main(String[] args) {
		RemoveKeyOccurences dll = new RemoveKeyOccurences();
		dll.createDLL();
		System.out.println("Original DLL: ");
		dll.printDLL(dll.head);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of the key whose all occurences you want to delete");
		int x = sc.nextInt();
		
		System.out.println("Modified DLL: ");
		Node newHead  = dll.deleteAllOccurOfX(dll.head, x);
		dll.printDLL(newHead);

	}

}

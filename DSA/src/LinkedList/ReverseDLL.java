package LinkedList;

import java.util.Scanner;

import LinkedList.CreateDLL.Node;

public class ReverseDLL {
	
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
    
    //Method to reverse the DLL
    public Node reverse(Node head) {
    	if(head==null || head.next==null) {
    		return head;
    	}
    	
    	Node current = head;
    	Node temp = null;
    	while(current!=null) {
    		temp = current.prev;
    		current.prev = current.next;
    		current.next =temp;
    		current = current.prev;
    	}
    	if(temp!=null) {
    		head = temp.prev;
    	}
    	return head;
    }
	
	public static void main(String[] args) {
		ReverseDLL dll = new ReverseDLL();
		dll.createDLL();
		System.out.println("Original doubly linked list: ");
		dll.printDLL(dll.head);
		
		Node newHead = dll.reverse(dll.head);
		System.out.println("Reversed doubly linked list:");
		dll.printDLL(newHead);

	}

}

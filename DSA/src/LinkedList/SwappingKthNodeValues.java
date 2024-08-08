package LinkedList;

import java.util.Scanner;

import LinkedList.CreateNodes.Node;

public class SwappingKthNodeValues {

	Node head;
    public static int size;

    SwappingKthNodeValues(){				//Constructor
        this.size = 0;
    }

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
            size++;				//Each time a node is created, size of LL increases by 1 
        }
    }
    
    

    // Method to create nodes in the linked list
    public void createNode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes you want to create: ");
        int numNodes = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        if(numNodes==0) {
        	System.out.println("You choose to create no nodes.");
        	return;
        }

        System.out.println("Enter the value to be stored in the head (first) node: ");
        int headVal = sc.nextInt();
        head = new Node(headVal); 						// Use the class-level head variable

        Node temp = head;
        for (int i = 2; i <= numNodes; i++) { 			// Start from 2 since the head node is already created
            System.out.println("Enter the value in the "+i+"th"+" node: ");
            int val = sc.nextInt();
            Node newNode = new Node(val);
            temp.next = newNode;
            temp = newNode;
        }
    }
    
    

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    //Method to swal the values of 'k'th node from starting with 'k'th node from end
    public Node swapNodes(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        Node start = head;
        Node end = head;
        Node first = head;

        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        end = first;

        while (end.next != null) {
            end = end.next;
            start = start.next;
        }

        int temp = first.val;
        first.val = start.val;
        start.val = temp;

        return head;
    }
	
	public static void main(String[] args) {
		SwappingKthNodeValues list = new SwappingKthNodeValues();
		list.createNode();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of kth node whose value you want to swap: ");
		int k = sc.nextInt();
		
		System.out.println("Linked list before swapping the "+k+"th node values:");
		list.printList();
		
		System.out.println("Linked list after swapping the value of the "+k+"th node from start and end is: ");
		list.swapNodes(list.head, k);
		list.printList();
		
		

	}

}

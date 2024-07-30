package LinkedList;

import java.util.Scanner;

import LinkedList.BinaryToDeci.Node;

public class RemoveDuplicates {

	Node head;
    public static int size;

    RemoveDuplicates(){				//Constructor
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
    public Node createNode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes you want to create: ");
        int numNodes = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        if(numNodes==0) {
        	System.out.println("You choose to create no nodes.");
        	return null;
        }
        
        System.out.println("Values in the nodes should be in sorted order!!");
        
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
        return head;
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
	
    //Method to remove the duplicates
       public Node deleteDuplicates(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node temp = head;

            while (temp != null && temp.next != null) {
                Node nextNode = temp.next;
                if (temp.val == nextNode.val) {
                    temp.next = nextNode.next;
                } else {
                    temp = temp.next;
                }
            }

            return head;
        }
    

    
    
	public static void main(String[] args) {
		RemoveDuplicates list = new RemoveDuplicates();
		Node head = list.createNode();
		System.out.print("Linked list before removing the duplicates: ");
		list.printList();
		System.out.print("Linked list after removing the duplicates: ");
		list.deleteDuplicates(head);
		list.printList();
		
	}

}

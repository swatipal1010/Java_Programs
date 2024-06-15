package LinkedList;

import java.util.Scanner;

import LinkedList.CreateNodes.Node;

public class ReverseLinkedList2 {
	
	Node head;
    public static int size;

    ReverseLinkedList2(){
        this.size = 0;
    }

    class Node {
        String val;
        Node next;

        Node(String val) {
            this.val = val;
            this.next = null;
            size++;
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
        String headVal = sc.nextLine();
        head = new Node(headVal); // Use the class-level head variable

        Node temp = head;
        for (int i = 2; i <= numNodes; i++) { // Start from 1 since the head node is already created
            System.out.println("Enter the value in the "+i+"th"+" node: ");
            String val = sc.nextLine();
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
    
    
    
    //Method to print the size of the existing linked list
    public int getSize() {
    	return size;
    }
	
    //Reverse a LinkedList iteratively using pointers
    public Node reverseLLIterative(Node head) {
    	Node curr = head;
    	Node prev = null;
    	Node forward;
    	
    	while(curr!=null) {
    		forward = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = forward;
    	}
    	return prev;
    }
    
    //Reverse linked list recursively
    public Node reverseLLRecursive(Node head) {
    	if(head==null || head.next==null)
    	{
    		return head;
    	}
    	
    	Node newHead = reverseLLRecursive(head.next);
    	head.next.next = head;
    	head.next = null;
    	return newHead;
    }
    
	public static void main(String[] args) {
		ReverseLinkedList2 list = new ReverseLinkedList2();
		
		list.createNode();
		System.out.println("Created Linked list is: ");
		list.printList();
		
		System.out.println("Size of the linked list is: "+list.getSize());
		
		list.head = list.reverseLLIterative(list.head);
		System.out.println("Reversed linked list is: ");
		list.printList();
		
		list.head = list.reverseLLRecursive(list.head);
		System.out.println("Reversed Linked List is: ");
		list.printList();

	}

}

package LinkedList;

import java.util.Scanner;

import LinkedList.RemoveDuplicates.Node;

public class RemoveAllDuplicates {
	
	Node head;
    public static int size;

    RemoveAllDuplicates(){				//Constructor
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
	
	//Method to remove all the duplicates from the linked list
    public Node deleteDuplicates(Node head) {
    	Node curr = head;
    	Node prev =null;
    	
    	while(curr!=null) {
    		if(curr.next!=null && curr.val==curr.next.val) {
    			int val = curr.val;
    			while(curr!=null && curr.val==val) {
    				curr = curr.next;
    			}
    			if(prev!=null) {
    				prev.next = curr;
    			}else {
    				head = curr;
    			}	
    		}else {
    			prev = curr;
    			curr = curr.next;
    		}	
    	}
    	return head;
    }
    
    
	public static void main(String[] args) {
		RemoveAllDuplicates list = new RemoveAllDuplicates();
		Node head = list.createNode();
		System.out.print("Linked list before removing the duplicates: ");
		list.printList();
		System.out.print("Linked list after removing the duplicates: ");
		list.deleteDuplicates(head);
		list.printList();

	}

}

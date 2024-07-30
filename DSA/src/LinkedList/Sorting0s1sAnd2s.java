package LinkedList;

import java.util.Scanner;

import LinkedList.RemoveDuplicates.Node;

public class Sorting0s1sAnd2s {

	Node head;
    public static int size;

    Sorting0s1sAnd2s(){				//Constructor
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
        
        System.out.println("Nodes should only contain either 0 or 1 or 2 only!!");
        
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
	
    
    //Method to sort 0s, 1s and 2s in the linked list
    public Node sortList(Node head) {
    	if(head==null || head.next==null) {
    		return null;
    	}
    	int count0 =0;
    	int count1 = 0;
    	int count2 =0;
    	int size = 0;
    	
    	Node temp = head;
    	while(temp!=null) {
    		if(temp.val==0) {
    			count0++;
    		}else if(temp.val==1) {
    			count1++;
    		}else {
    			count2++;
    		}
    		size++;
    		temp = temp.next;
    	}
    	
    	temp = head;
    	for(int i=0; i<count0; i++) {
    		temp.val = 0;
    		temp = temp.next;
    	}
    	
    	for(int i = 0; i<count1; i++) {
    		temp.val = 1;
    		temp = temp.next;
    	}
    	
    	for(int i=0; i<count2; i++) {
    		temp.val = 2;
    		temp = temp.next;
    	}
    	
    	return head;
    }
	
	public static void main(String[] args) {
		Sorting0s1sAnd2s list = new Sorting0s1sAnd2s();
		
		Node head = list.createNode();
		System.out.println("List before sorting: ");
		list.printList();
		
		System.out.println("List after sorting is: ");
		list.sortList(head);
		list.printList();

	}

}

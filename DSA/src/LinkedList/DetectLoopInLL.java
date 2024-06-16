package LinkedList;

import java.util.Scanner;

import LinkedList.NthNodeFromEnd.Node;

public class DetectLoopInLL {
	
	Node head;
    public static int size;

    DetectLoopInLL(){
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
	
    
    //Method to detect the cycle in the linked list
    public boolean detectCycle(Node head) {
    	Node fast = head;
    	Node slow = head;
    	
    	while(fast!=null && fast.next!=null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		if(slow==fast) {
    			return true;
    		}
    	}
    	return false;
    }
    
    
    
	public static void main(String[] args) {
		DetectLoopInLL list = new DetectLoopInLL();
		
		list.createNode();
		System.out.println("Linked list being created: ");
		list.printList();
		
		Boolean hasCycle = list.detectCycle(list.head);
		
		if(hasCycle==true) {
			System.out.println("There exists a cycle in the linked list");
		}else {
			System.out.println("There exists no cycle in the linked list");
		}
	}

}

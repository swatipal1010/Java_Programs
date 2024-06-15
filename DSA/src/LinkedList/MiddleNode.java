package LinkedList;

import java.util.Scanner;

import LinkedList.ReverseLinkedList2.Node;

public class MiddleNode {

	Node head;
    public static int size;

    MiddleNode(){
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
	
	
    //Method-1
    //Finding the middle node of the linked list(Returning the second mid value in case of even no. of total nodes) using hare-turtle approach
    public Node midNodeVal(Node head) {
    	if(head==null || head.next==null) {
    		return head;
    	}
    	Node slow = head;
    	Node fast = head.next;
    	
    	int count=0;
    	while(fast!=null) {
    		fast = fast.next;
    		slow = slow.next;
    		if(fast!=null) {
    			fast = fast.next;
    		}
    		count++;
    	}
    	System.out.println((count+1)+"th node is the middle node.");
    	return slow;
    	  	
    }
    
    //Method-2 
    //Finding middle node by counting the total no. of nodes
    public void midNodeVal2(Node head) {
    	Node temp = head;
    	if(head == null) {
    		System.out.println("Linked list is empty!!");
    	}else if(head.next==null) {
    		System.out.println("head is the middle node since we have only 1 node in the linked list");
    	}
    	else {
    		int count=0;
    		while(temp!=null) {
    			count++;
    			temp = temp.next;
    		}
    		int mid = count/2+1;
    		System.out.println("Middle node is at : "+mid+"th position");
    	}
    }
	
	public static void main(String[] args) {
		MiddleNode list = new MiddleNode();
		
		list.createNode();
		System.out.println("Linked list being created is: ");
		list.printList();
		
		list.midNodeVal(list.head);		
		
		list.midNodeVal2(list.head);	

	}

}

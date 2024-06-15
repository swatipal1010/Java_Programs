package LinkedList;

import java.util.Scanner;

public class NthNodeFromEnd {

	Node head;
    public static int size;

    NthNodeFromEnd(){
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
	
    
    //Method to find the next node from end and deleting it
    public Node NthEndNode(Node head , int n) {
    	if (head == null || head.next == null) {
            if (n == 1) {
                size--;
                return null;
            } else {
                return head;
            }
        }

    	
    	Node temp = head;
    	int count =0;
    	while(temp!=null) {
    		count++;
    		temp = temp.next;
    	}
    	
    	if (n > count) {
            System.out.println("n is larger than the size of the list. No node will be removed.");
            return head;
        }
    	
    	int NthFromStart = (count-n)+1;
    	int prev = NthFromStart-1;
    	
    	temp = head;
    	if(n==count) {
    		size--;
    		return head.next;
    	}
    	
    	while(prev>1) {
    		temp = temp.next;
    		prev--;
    	}
    	
    	if (temp.next != null) {
            temp.next = temp.next.next;
        }
    	
    	return head;
    }
	
	public static void main(String[] args) {
		NthNodeFromEnd list = new NthNodeFromEnd();
		
		list.createNode();
		list.printList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size of the Linked List is: "+list.getSize()+". Choose the position of the node from the end to be removed");
		int num = sc.nextInt();
		
		list.head= list.NthEndNode(list.head, num);
		list.printList();

	}

}

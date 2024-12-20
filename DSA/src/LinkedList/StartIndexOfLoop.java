package LinkedList;

import java.util.Scanner;

import LinkedList.DetectLoopInLL.Node;

public class StartIndexOfLoop {
	
	Node head;
    public static int size;

    StartIndexOfLoop(){
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
	
    //Method to detect loop and return the start node of the loop
    public Node detectCycle(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        
        Node slow = head;
        Node fast = head;
        
        // Detect if there's a cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        
        // If no cycle is found
        if (fast == null || fast.next == null) {
            return null;
        }
        
        // Find the start of the cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow; // the start of the cycle
    }
    
	
	public static void main(String[] args) {
		StartIndexOfLoop list = new StartIndexOfLoop();
		list.createNode();
		list.printList();
		
		Node cycle = list.detectCycle(list.head);
		
		if(cycle==null) {
			System.out.println("There exists no loop in the linked list");
		}else {
			System.out.println("Cycle is detected at node with value: "+cycle.val);
		}

	}

}

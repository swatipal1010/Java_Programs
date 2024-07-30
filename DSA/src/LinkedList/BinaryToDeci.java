package LinkedList;
import java.util.*;
import java.util.Scanner;

import LinkedList.CreateNodes.Node;

public class BinaryToDeci {

	    Node head;
	    public static int size;

	    BinaryToDeci(){				//Constructor
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
	        
	        System.out.println("You are allowed to store either 1 or 0 only!!!");
	        System.out.println("");
	        
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
	    
	    //Method to convert the binary number stored in linked list to its equivalent decimal number
	    public int getDecimalValue(Node head) {
	        Node curr = head;
	        Node prev = null;
	        while(curr!=null){
	            Node next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;
	        }

	        head = prev;
	        Node temp = head;
	        int deciNum = 0;
	        int power =0;
	        while(temp!=null){
	            deciNum += Math.pow(2,power)*temp.val;
	            power++;
	            temp = temp.next;
	        }
	        return deciNum;
	    }
	
	
	    
	//main() method
	public static void main(String[] args) {
		BinaryToDeci list = new BinaryToDeci();
		Node head = list.createNode();
		
		System.out.println("Linked list contains the following nodes composing binary number: ");
		list.printList();
		
		System.out.println("The equivalent decimal number obtained is: "+list.getDecimalValue(head));

	}

}

package LinkedList;

import java.util.Scanner;

import LinkedList.CreateNodes.Node;

public class PalindromeLL2 {
	
	Node head;
    public static int size;

    PalindromeLL2(){
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
    
    
    //Method to check whether the linked list is palindromic or not using hare turtle approach (2 pointers approach)
    //Space complexity = 	O(1) --> Optimal solution
    public boolean isPalindrome(Node head) {
    	if(head==null) {
    		System.out.println("There is no node in the linked list");
    		return false;
    	}else if(head.next==null) {
    		return true;
    	}else {
    		Node fast = head;
    		Node slow = head;
    		Node mid;
    		
    		while(fast!=null && fast.next!=null) {
    			slow = slow.next;
    			fast=fast.next.next;
    		}
    		mid = slow;
    		
    		//reverse a linked list
    		Node curr = slow;
        	Node prev = null;
        	Node forward;
        	
        	while(curr!=null) {
        		forward = curr.next;
        		curr.next = prev;
        		prev = curr;
        		curr = forward;
        	}
        	
        	//check palindrome
        	Node left = head;
        	Node right = prev;
        	while(right!=null) {
        		if(!(left.val).equals(right.val)) {
        			return false;
        		}
        		left=left.next;
        		right=right.next;
        	}
        	return true;
    	}
    }
    
	
    
    
	public static void main(String[] args) {
		PalindromeLL2 list = new PalindromeLL2();
		list.createNode();
		list.printList();
		
		boolean palindrome = list.isPalindrome(list.head);
		
		if(palindrome==true) {
			System.out.println("Linkedlist is palindromic.");
		}else {
			System.out.println("Linked list is not palindromic");
		}

	}

}

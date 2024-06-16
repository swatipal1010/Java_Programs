package LinkedList;

import java.util.Scanner;

import LinkedList.CreateNodes.Node;

public class PalindromeLL {
	
	Node head;
    public static int size;

    PalindromeLL(){
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
    
    
    //Method to check that given linked  list is palindrome or not
    public boolean isPalindrome(Node head) {
    	if(head==null) {
    		System.out.println("There exists no node in the linked list");
    		return false;
    	}else if(head.next==null) {
    		return true;
    	}else {
    		String arr[] = new String[getSize()];
    		Node temp = head;
    		for(int i=0; i<arr.length;i++) {
    			arr[i] = temp.val;
    			temp = temp.next;
    		}
    		
    		int start = 0;
    		int end = arr.length-1;
    		boolean status = true;
    		while(start<=end) {
    			if(!arr[start].equals(arr[end])) {
    				return false;
    			}
    			start++;
    			end--;
    			
    		}
    	}
    	return true;
    }
    
	
	public static void main(String[] args) {
		PalindromeLL list = new PalindromeLL();
		
		list.createNode();
		list.printList();
		
		boolean palindrome = list.isPalindrome(list.head);
		if(palindrome==true) {
			System.out.println("Linked list is palindrome");
		}else {
			System.out.println("Linked list is not palindrome");
		}
	}

}

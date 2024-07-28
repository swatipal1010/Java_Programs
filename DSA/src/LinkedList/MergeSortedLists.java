package LinkedList;

import java.util.Scanner;

import LinkedList.NthNodeFromEnd.Node;

public class MergeSortedLists {

	Node head;
    public static int size;

    MergeSortedLists(){
        this.size = 0;
    }

    class Node {
        int val;
        Node next;
        
        Node(){};
        
        Node(int val) {
            this.val = val;
            this.next = null;
            size++;
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
        
        System.out.println("Enter the values in the nodes in sorted order!!!!");
        
        
        System.out.println("Enter the value to be stored in the head (first) node: ");
        int headVal = sc.nextInt();
        head = new Node(headVal); // Use the class-level head variable

        Node temp = head;
        for (int i = 2; i <= numNodes; i++) { // Start from 1 since the head node is already created
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
    
    
    
    //Method to print the size of the existing linked list
    public int getSize() {
    	return size;
    }
	
	
    //Method to merge the sorted lists
    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node();  
        Node temp = dummy;

        
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        
        head = dummy.next;
        return head;  
    }
    
	
	public static void main(String[] args) {
		MergeSortedLists list = new MergeSortedLists();
		
		Node list1 = list.createNode();
		Node list2 = list.createNode();
		
		System.out.println("First list before merging: ");
		list.printList();
		
		System.out.println("Second list before merging: ");
		list.printList();
		
		list.mergeTwoLists(list1,  list2);
		System.out.println("Merged list obtained is: ");
		list.printList();
		

	}

}

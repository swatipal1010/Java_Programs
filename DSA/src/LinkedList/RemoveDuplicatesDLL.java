package LinkedList;

import java.util.Scanner;

import LinkedList.RemoveKeyOccurences.Node;

public class RemoveDuplicatesDLL {

	Node head;
    Node tail;

    class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Method to create a doubly linked list
    public void createDLL() {
        System.out.println("Enter the number of nodes you want to create: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        if (size == 0) {
            System.out.println("You decided to create no node.");
            return;
        }

        System.out.println("Enter the value in the head node: ");
        int headVal = sc.nextInt();
        head = new Node(headVal);
        tail = head; // Initialize tail as the head initially

        Node temp = head;
        for (int i = 1; i < size; i++) {
            System.out.println("Enter the value in the " + (i + 1) + "th node: ");
            int value = sc.nextInt();
            Node newNode = new Node(value);
            temp.next = newNode;
            newNode.prev = temp;
            temp = temp.next;
        }
        tail = temp; // Update the tail to the last node
    }

    // Method to print the doubly linked list
    public void printDLL(Node head) {
        Node temp = head;
        if (temp == null) {
            System.out.println("null");
            return;
        }

        System.out.print("null <- ");
        while (temp != null) {
        	if(temp.next==null) {
        		System.out.print(temp.val+" ->");
        	}else {
        		System.out.print(temp.val + " <-> ");
        	}
            temp = temp.next;
        }
        System.out.println(" null");
    }
    

    //Method to remove the duplicates elements from the DLL while keeping only 1st occurrence of the duplicate
    public Node removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        Node nextNode;
        while(temp.next!=null){
            nextNode = temp.next;
            if(temp.val==nextNode.val){
                temp.next = nextNode.next;
            }else{
                temp.next.prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
	
	
	public static void main(String[] args) {
		RemoveDuplicatesDLL list = new RemoveDuplicatesDLL();
		list.createDLL();
		
		System.out.println("DLL is: ");
		list.printDLL(list.head);
		
		System.out.println("Linked list after removing duplicates if present: ");
		list.removeDuplicates(list.head);
		
		list.printDLL(list.head);
	}

}

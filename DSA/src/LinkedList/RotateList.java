package LinkedList;

import java.util.Scanner;

import LinkedList.Add1ToList.Node;

public class RotateList {

	Node head;
    public static int size;

    RotateList() {
        this.size = 0;
    }

    class Node {
        int val;
        Node next;

        Node(int val) {
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

        if (numNodes == 0) {
            System.out.println("You choose to create no nodes.");
            return;
        }

        System.out.println("Enter the value to be stored in the head (first) node: ");
        int headVal = sc.nextInt();
        head = new Node(headVal); // Use the class-level head variable

        Node temp = head;
        for (int i = 2; i <= numNodes; i++) { // Start from 1 since the head node is already created
            System.out.println("Enter the value in the " + i + "th" + " node: ");
            int val = sc.nextInt();
            Node newNode = new Node(val);
            temp.next = newNode;
            temp = newNode;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

	
    //Method to rotate the list
    public Node rotateLL(Node head, int k) {
    	if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        Node tail = head;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        k = k % length;
        if (k == 0) {
            return head;
        }

        Node newTail = head;
        for (int i = 1; i < length - k; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
	
	public static void main(String[] args) {
		RotateList list = new RotateList();
		list.createNode();
		System.out.println("Linked list before rotating: ");
		list.printList();
		
		list.head = list.rotateLL(list.head, 2);
		System.out.println("Linked list after rotating 2 times: ");
		list.printList();

	}

}

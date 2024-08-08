package LinkedList;

import java.util.Scanner;

public class CreateDLL {
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
    public void printDLL() {
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

    // Adding node at the beginning
    public void addAtStart() {
        System.out.println("Enter the value to be stored in the node: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode; // If the list was empty, update both head and tail
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Adding node at the tail
    public void addAtTail() {
        System.out.println("Enter the value to be stored in the node: ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode; // If the list was empty, update both head and tail
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode; // Update the tail reference
        }
    }

    // Delete node from the start
    public void deleteStart() {
        if (head == null) {
            System.out.println("There exists no node in the linked list that can be deleted.");
            return;
        }

        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // Reset tail if the list is empty
        }
    }

    // Delete node from the end
    public void deleteTail() {
        if (head == null) {
            System.out.println("There's no node to be deleted in the linked list.");
            return;
        }

        if (tail == head) { // Only one node
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public static void main(String[] args) {
        CreateDLL list = new CreateDLL();
        list.createDLL();
        System.out.println("Doubly linked list is: ");
        list.printDLL();
        System.out.println(" ");

        System.out.println("Adding the value at the beginning of the linked list: ");
        list.addAtStart();
        System.out.println("DLL after adding node at front: ");
        list.printDLL();
        System.out.println(" ");

        System.out.println("Adding value at last of the linked list: ");
        list.addAtTail();
        System.out.println("DLL after adding node at tail: ");
        list.printDLL();
        System.out.println(" ");

        System.out.println("Deleting node from starting of DLL: ");
        list.deleteStart();
        System.out.println("DLL after removing first node: ");
        list.printDLL();
        System.out.println(" ");

        System.out.println("Removing node from last: ");
        list.deleteTail();
        System.out.println("DLL after removing last node: ");
        list.printDLL();
    }
}

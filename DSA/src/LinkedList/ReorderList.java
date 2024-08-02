package LinkedList;

import java.util.Scanner;

public class ReorderList {

    Node head;
    public static int size;

    ReorderList() { // Constructor
        this.size = 0;
    }

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
            size++; 																	// Each time a node is created, size of LL increases by 1
        }
    }

    // Method to create nodes in the linked list
    public Node createNode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes you want to create: ");
        int numNodes = sc.nextInt();
        sc.nextLine(); 																	// Consume the leftover newline

        if (numNodes == 0) {
            System.out.println("You choose to create no nodes.");
            return null;
        }

        System.out.println("Enter the value to be stored in the head (first) node: ");
        int headVal = sc.nextInt();
        head = new Node(headVal); 														// Use the class-level head variable

        Node temp = head;
        for (int i = 2; i <= numNodes; i++) { 											// Start from 2 since the head node is already created
            System.out.println("Enter the value in the " + i + "th" + " node: ");
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
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to reverse a linked list
    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node forward;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    // Method to reorder the linked list
    public Node reorderLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node secondHalf = reverse(slow.next);
        slow.next = null; 								// Break the list into two halves

        // Merge the two halves
        Node firstHalf = head;
        while (secondHalf != null) {
            Node temp1 = firstHalf.next;
            Node temp2 = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = temp1;

            firstHalf = temp1;
            secondHalf = temp2;
        }

        return head;
    }

    public static void main(String[] args) {
        ReorderList list = new ReorderList();
        Node head = list.createNode();
        System.out.println("Created linked list is: ");
        list.printList();

        System.out.println("Reordered LinkedList is: ");
        list.reorderLL(head);
        list.printList();
    }
}

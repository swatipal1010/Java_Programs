package LinkedList;

import java.util.Scanner;

public class SplitLL {
    Node head;
    public static int size;

    SplitLL() {
        this.size = 0;
    }

    class Node {
        int val;
        Node next;

        Node() {}

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

        if (numNodes == 0) {
            System.out.println("You choose to create no nodes.");
            return null;
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

    // Method to print the size of the existing linked list
    public int getSize() {
        return size;
    }

    // Method to calculate the length of the linked list
    public static int lengthOfLL(Node head) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // Method to split the linked list into 'k' parts
    public static Node[] splitListToParts(Node head, int k) {
        Node[] result = new Node[k]; // Initialize the array of Node

        if (head == null) {
            // If the list is empty, return an array of k null elements
            return result;
        }

        int lengthLL = lengthOfLL(head);
        int baseLength = lengthLL / k;
        int extraNodes = lengthLL % k;

        Node curr = head;
        Node prev = null;

        for (int i = 0; i < k; i++) {
            result[i] = curr;
            int partSize = baseLength + (extraNodes > 0 ? 1 : 0);
            for (int count = 0; count < partSize; count++) {
                if (curr != null) {
                    prev = curr;
                    curr = curr.next;
                }
            }
            if (prev != null) {
                prev.next = null;
            }
            if (extraNodes > 0) {
                extraNodes--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SplitLL list = new SplitLL();
        Node head = list.createNode();
        System.out.println("Original linked list:");
        list.printList();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of parts (k) to split the linked list into: ");
        int k = sc.nextInt();
        sc.close();

        Node[] parts = splitListToParts(head, k);
        System.out.println("Split linked list into " + k + " parts:");
        for (int i = 0; i < parts.length; i++) {
            Node current = parts[i];
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
}

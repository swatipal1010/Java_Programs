package LinkedList;

import java.util.Scanner;

public class RightLargerValue {

    Node head;
    public static int size;

    RightLargerValue() {
        this.size = 0;
    }

    class Node {
        int val;
        Node next;

        Node() {
        }

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
            System.out.println("Enter the value in the " + i + "th node: ");
            int val = sc.nextInt();
            Node newNode = new Node(val);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    // Method to print the linked list
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Helper method to reverse the linked list
    private Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Method to remove nodes with greater values on their right
    public Node removeNodesWithGreaterValuesOnRight(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Reverse the linked list
        head = reverseList(head);

        // Step 2: Traverse the reversed list and keep nodes with no greater value on the left
        Node curr = head;
        Node maxNode = curr;
        Node newHead = curr;
        curr = curr.next;

        while (curr != null) {
            if (curr.val >= maxNode.val) {
                maxNode.next = curr;
                maxNode = curr;
            }
            curr = curr.next;
        }
        maxNode.next = null; // Ensure the new list ends properly

        // Step 3: Reverse the list back to original order
        head = reverseList(newHead);

        return head;
    }

    public static void main(String[] args) {
        RightLargerValue list = new RightLargerValue();

        Node myHead = list.createNode();
        System.out.println("Original linked list is: ");
        list.printList(myHead);

        System.out.println("Linked list with nodes where no node has a larger value in its right node(s) is:");
        myHead = list.removeNodesWithGreaterValuesOnRight(myHead);
        list.printList(myHead);
    }
}

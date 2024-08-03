package LinkedList;

import java.util.Scanner;

public class DeleteMiddleNode {
    Node head;
    public static int size;

    DeleteMiddleNode() {
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

        if (numNodes == 0) {
            System.out.println("You choose to create no nodes.");
            return;
        }

        System.out.println("Enter the value to be stored in the head (first) node: ");
        String headVal = sc.nextLine();
        head = new Node(headVal); // Use the class-level head variable

        Node temp = head;
        for (int i = 2; i <= numNodes; i++) { // Start from 2 since the head node is already created
            System.out.println("Enter the value in the " + i + "th" + " node: ");
            String val = sc.nextLine();
            Node newNode = new Node(val);
            temp.next = newNode;
            temp = newNode;
        }
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

    // Method to find the middle node
    public Node findMiddleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Method to delete the middle node
    public Node delMidNodeVal(Node head) {
        if (head == null || head.next == null) {
            return null; // No middle node to delete if there's 0 or 1 node
        }

        Node middleNode = findMiddleNode(head);
        Node temp = head;

        // If the head is the middle node
        if (head == middleNode) {
            return head.next;
        }

        // Traverse the list until the node before the middle node
        while (temp.next != middleNode) {
            temp = temp.next;
        }

        // Skip the middle node
        temp.next = middleNode.next;

        return head;
    }

    public static void main(String[] args) {
        DeleteMiddleNode list = new DeleteMiddleNode();
        list.createNode();
        Node myHead = list.delMidNodeVal(list.head);
        System.out.println("Updated list is: ");
        list.printList(myHead);
    }
}

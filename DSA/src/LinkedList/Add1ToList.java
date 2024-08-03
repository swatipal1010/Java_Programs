package LinkedList;

import java.util.Scanner;

public class Add1ToList {

    Node head;
    public static int size;

    Add1ToList() {
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

    // Helper method: To reverse the linked list
    public static Node revLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node forward;
        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    // Method to add one to the linked list
    public Node addOne(Node head) {
        if (head == null) {
            return head;
        }

        // Reverse the linked list
        Node prevHead = revLL(head);

        // Add 1 to the reversed list
        int carry = 1;
        Node temp = prevHead;
        Node prevTemp = null;

        while (temp != null) {
            int sum = temp.val + carry;
            temp.val = sum % 10;
            carry = sum / 10;
            prevTemp = temp;
            temp = temp.next;
        }

        // If there's a carry left, add a new node at the end
        if (carry > 0) {
            prevTemp.next = new Node(carry);
        }

        // Reverse the list again to restore the original order
        Node ans = revLL(prevHead);
        return ans;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        Add1ToList list = new Add1ToList();
        list.createNode();
        System.out.println("Linked list after adding 1 to it is: ");
        list.head = list.addOne(list.head); // Update the head of the list
        list.printList();
    }
}

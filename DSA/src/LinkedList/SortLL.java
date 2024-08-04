package LinkedList;

import java.util.Scanner;

public class SortLL {

    Node head;
    public static int size;

    SortLL() {
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

    // METHOD TO SORT THE LIST
    public Node mergeTwoLists(Node list1, Node list2) {
        Node dummy = new Node(0); // Using 0 or any integer value for dummy initialization
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

        return dummy.next;
    }

    public Node midOfLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = midOfLL(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);

        return mergeTwoLists(left, right);
    }

    public static void main(String[] args) {
        SortLL list = new SortLL();
        list.createNode();
        System.out.println("Original linked list is: ");
        list.printList();

        // Call the sortList method and update the head
        list.head = list.sortList(list.head);

        System.out.println("Sorted linked list is: ");
        list.printList();
    }
}

package LinkedList;

import java.util.Scanner;

public class MultiplyLists {

    Node head;
    public static int size;

    MultiplyLists() { // Constructor
        this.size = 0;
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
            size++; // Each time a node is created, size of LL increases by 1
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
        for (int i = 2; i <= numNodes; i++) { // Start from 2 since the head node is already created
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

    // Method to reverse the linked list
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
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

    // Method to multiply the numbers present in the two linked lists
    public static Node multiplyLists(Node l1head, Node l2head) {
        if (l1head == null || l1head.next == null) {
            return l1head;
        } else if (l2head == null || l2head.next == null) {
            return l2head;
        }

        // reverse both the lists
        Node temp1 = reverse(l1head);
        Node temp2 = reverse(l2head);

        int Nval1 = 0;
        int mul = 1;
        while (temp1 != null) {
            Nval1 += temp1.val * mul;
            mul = mul * 10;
            temp1 = temp1.next;
        }
        int Nval2 = 0;
        mul = 1;
        while (temp2 != null) {
            Nval2 += temp2.val * mul;
            mul = mul * 10;
            temp2 = temp2.next;
        }

        int ans = Nval1 * Nval2;
        if (ans == 0) {
            return new Node(0);
        }
        Node oppoHead = null;
        Node temp = null;
        while (ans != 0) {
            int tempVar = ans % 10;
            Node newNode = new Node(tempVar);
            if (oppoHead == null) {
                oppoHead = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
            ans = ans / 10;
        }
        Node newHead = reverse(oppoHead);
        return newHead;
    }

    public static void main(String[] args) {
        MultiplyLists listA = new MultiplyLists();
        MultiplyLists listB = new MultiplyLists();

        System.out.println("Creating first LinkedList: ");
        Node head1 = listA.createNode();
        System.out.println("Creating second LinkedList: ");
        Node head2 = listB.createNode();

        System.out.println("LinkedList1 is: ");
        listA.printList();

        System.out.println("LinkedList2 is: ");
        listB.printList();

        Node mulHead = multiplyLists(head1, head2);
        System.out.println("Result of multiplication is: ");
        MultiplyLists result = new MultiplyLists();
        result.head = mulHead;
        result.printList();
    }
}

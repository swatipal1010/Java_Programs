package LinkedList;

public class CircularLLSplit {

    static Node head, head1, head2;

    static class Node {
        int data;
        Node next, prev;
        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    // Method to split a list into 2 lists
    // head1_ref and head2_ref are references to head nodes of the 2 resultant linked lists
    void splitList() {
        Node slow_ptr = head;
        Node fast_ptr = head;

        if (head == null) {
            return;
        }

        // If there are odd no. of nodes in the circular LL then fast_ptr.next becomes head and for even no. of nodes fast_ptr.next.next becomes head
        while (fast_ptr.next != head && fast_ptr.next.next != head) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }

        // If there are even elements in the list then move fast_ptr
        if (fast_ptr.next.next == head) {
            fast_ptr = fast_ptr.next;
        }

        // Set the head pointer to first half
        head1 = head;

        // Set the head pointer for 2nd half
        if (head.next != head) {
            head2 = slow_ptr.next;
        }

        // Making 2nd half circular
        fast_ptr.next = slow_ptr.next;

        // Make 1st half circular
        slow_ptr.next = head;
    }

    // Method to print the LL
    void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularLLSplit list = new CircularLLSplit();

        list.head = new Node(12);
        list.head.next = new Node(10);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(8);
        list.head.next.next.next.next = list.head; // Making the list circular

        System.out.println("Original Circular LinkedList: ");
        list.printList(head);

        // Split the list
        list.splitList();
        System.out.println("First circular linked list is: ");
        list.printList(head1);
        System.out.println("Second circular linked list is: ");
        list.printList(head2);
    }
}

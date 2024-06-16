package LinkedList;

import java.util.Scanner;

public class LoopOperationsInLL {

    Node head;
    public static int size;

    LoopOperationsInLL() {
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
        sc.nextLine();  // Consume the leftover newline

        if (numNodes == 0) {
            System.out.println("You chose to create no nodes.");
            return;
        }

        System.out.println("Enter the value to be stored in the head (first) node: ");
        String headVal = sc.nextLine();
        head = new Node(headVal);  // Use the class-level head variable

        Node temp = head;
        for (int i = 2; i <= numNodes; i++) {  // Start from 2 since the head node is already created
            System.out.println("Enter the value in the " + i + "th" + " node: ");
            String val = sc.nextLine();
            Node newNode = new Node(val);
            temp.next = newNode;
            temp = newNode;
        }

        // For testing, creating a loop manually (e.g., node 3 points back to node 2)
        if (numNodes > 2) {
            Node loopNode = head.next.next;  // e.g., node 3
            temp.next = loopNode;  // creating a loop for testing
        }
    }

    
    
    // Method to print the linked list
    public void printList() {
        Node current = head;
        Node fast = head;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;

            // Move the fast pointer
            if (fast != null && fast.next != null) {
                fast = fast.next.next;
            } else {
                fast = null;
            }

            // Check for loop
            if (current == fast) {
                System.out.print("(loop detected) ");
                break;
            }
        }
        System.out.println("null");
    }

    
    
    // Method to print the size of the existing linked list
    public int getSize() {
        return size;
    }
    
    

    // Method to return the node where fast and slow pointers meet in the loop of Linked list
    public Node loopInLL(Node head) {
        Node fast = head;
        Node slow = head;

        if (head == null || head.next == null) {
            return null;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    
    
    // Method to find the starting point of the loop in linked list
    public Node startingNode(Node head, Node pointOfIntr) {
        if (pointOfIntr == null) return null;
        Node slow = head;
        Node temp = pointOfIntr;

        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }
        return slow;
    }

    
    
    // Method to remove the loop from the linked list
    public void removeLoop(Node pointOfIntr) {
        if (pointOfIntr == null) return;

        Node temp = pointOfIntr;
        Node startNode = startingNode(head, pointOfIntr);
        while (temp.next != startNode) {
            temp = temp.next;
        }
        temp.next = null;
    }

    
    
    
    public static void main(String[] args) {
        LoopOperationsInLL list = new LoopOperationsInLL();

        list.createNode();
        System.out.println("Created linked list is: ");
        list.printList();

        Node pointOfIntr = list.loopInLL(list.head);
        if (pointOfIntr != null) {
            System.out.println("Point of intersection is found at " + pointOfIntr.val);

            Node startNode = list.startingNode(list.head, pointOfIntr);
            if (startNode != null) {
                System.out.println("The start node of the loop is at " + startNode.val);
            } else {
                System.out.println("No loop detected.");
            }
        } else {
            System.out.println("No intersection found, hence no loop.");
        }

        list.removeLoop(pointOfIntr);
        System.out.println("Linked list after removing the loop: ");
        list.printList();
    }
}

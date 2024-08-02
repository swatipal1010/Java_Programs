package LinkedList;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MergekLists {

    Node head;
    public static int size;

    MergekLists() { // Constructor
        this.size = 0;
    }

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
            size++;  // Each time a node is created, size of LL increases by 1
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
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    // Method to merge 'k' sorted lists together to produce a single sorted linked list
    public Node mergeLists(Node[] heads) {
        // Check if all heads are null
        boolean allNull = true;
        for (Node head : heads) {
            if (head != null) {
                allNull = false;
                break;
            }
        }
        if (allNull) {
            return null;
        }
        
        ArrayList<Integer> arrList = new ArrayList<>();
        for (Node head : heads) {
            Node temp = head;
            while (temp != null) {
                arrList.add(temp.val); // Add the value to the ArrayList
                temp = temp.next; 
            }
        }
        
        Collections.sort(arrList);
        
        // Reassign the sorted values to the nodes
        int index = 0;
        for (Node head : heads) {
            Node temp = head;
            while (temp != null) {
                temp.val = arrList.get(index++);
                temp = temp.next;
            }
        }
        
        // Connect all the lists to form a single sorted list
        Node newHead = null;
        Node newTail = null;
        
        for (Node head : heads) {
            if (head != null) {
                if (newHead == null) {
                    newHead = head;
                    newTail = head;
                } else {
                    newTail.next = head;
                }
                
                while (newTail.next != null) {
                    newTail = newTail.next;
                }
            }
        }
        
        return newHead;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of linked lists you want to create: ");
        int k = sc.nextInt();

        Node[] heads = new Node[k];
        MergekLists[] lists = new MergekLists[k];

        for (int i = 0; i < k; i++) {
            lists[i] = new MergekLists();
            System.out.println("Creating LinkedList " + (i + 1) + ": ");
            heads[i] = lists[i].createNode();
        }

        for (int i = 0; i < k; i++) {
            System.out.println("LinkedList " + (i + 1) + " is: ");
            lists[i].printList(heads[i]);
        }

        MergekLists merger = new MergekLists();
        Node sortedHead = merger.mergeLists(heads);
        
        System.out.println("Sorted single linked list: ");
        merger.printList(sortedHead);
    }
}

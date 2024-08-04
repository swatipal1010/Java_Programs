package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node bottom;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}

public class MultiLevelLinkedList {
    Node head;

    // Method to create a multilevel singly linked list
    public void createList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of main list nodes you want to create: ");
        int numMainNodes = sc.nextInt();

        if (numMainNodes == 0) {
            System.out.println("You chose to create no nodes.");
            return;
        }

        Node temp = null;
        for (int i = 1; i <= numMainNodes; i++) {
            System.out.println("Enter the value for the " + i + "th main list node: ");
            int mainData = sc.nextInt();
            Node newNode = new Node(mainData);

            if (head == null) {
                head = newNode;
            } else {
                temp.next = newNode;
            }
            temp = newNode;

            System.out.println("Enter the number of bottom nodes for this main node: ");
            int numBottomNodes = sc.nextInt();

            Node bottomTemp = null;
            for (int j = 1; j <= numBottomNodes; j++) {
                System.out.println("Enter the value for the " + j + "th bottom node: ");
                int bottomData = sc.nextInt();
                Node newBottomNode = new Node(bottomData);

                if (temp.bottom == null) {
                    temp.bottom = newBottomNode;
                } else {
                    bottomTemp.bottom = newBottomNode;
                }
                bottomTemp = newBottomNode;
            }
        }
    }

    // Method to print the multilevel linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            Node bottomTemp = temp.bottom;
            while (bottomTemp != null) {
                System.out.print(bottomTemp.data + " -> ");
                bottomTemp = bottomTemp.bottom;
            }
            System.out.println("null");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MultiLevelLinkedList list = new MultiLevelLinkedList();
        list.createList();
        System.out.println("The created multilevel linked list is: ");
        list.printList();
    }
}


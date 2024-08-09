package LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

import LinkedList.ReverseDLL.Node;

public class SumPairInDLL {

	Node head;
    Node tail;

    class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Method to create a doubly linked list
    public void createDLL() {
        System.out.println("Enter the number of nodes you want to create: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        if (size == 0) {
            System.out.println("You decided to create no node.");
            return;
        }

        System.out.println("Enter the value in the head node: ");
        int headVal = sc.nextInt();
        head = new Node(headVal);
        tail = head; // Initialize tail as the head initially

        Node temp = head;
        for (int i = 1; i < size; i++) {
            System.out.println("Enter the value in the " + (i + 1) + "th node: ");
            int value = sc.nextInt();
            Node newNode = new Node(value);
            temp.next = newNode;
            newNode.prev = temp;
            temp = temp.next;
        }
        tail = temp; // Update the tail to the last node
    }

    // Method to print the doubly linked list
    public void printDLL(Node head) {
        Node temp = head;
        if (temp == null) {
            System.out.println("null");
            return;
        }

        System.out.print("null <- ");
        while (temp != null) {
        	if(temp.next==null) {
        		System.out.print(temp.val+" ->");
        	}else {
        		System.out.print(temp.val + " <-> ");
        	}
            temp = temp.next;
        }
        System.out.println(" null");
    }
    
    
    //Method to find the pair of values whose sum is equal to the given target
    public static Node findTail(Node head){
        Node tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        return tail;
    }
    public ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        if(head==null || head.next==null){
            return list;
        }
        Node left = head;
        Node right = findTail(head);
        
        while(left.val<right.val){
            if(left.val+right.val==target){
                ArrayList<Integer> innerList = new ArrayList<>();
                innerList.add(left.val);
                innerList.add(right.val);
                list.add(innerList);
                
                left = left.next;
                right = right.prev;
            }else if(left.val+right.val>target){
                right = right.prev;
            }else{
                left = left.next;
            }
        }        
        return list;
    }
	
    
    //MAIN METHOD
	public static void main(String[] args) {
	SumPairInDLL list = new SumPairInDLL();
	list.createDLL();
	
	System.out.println("DLL is: ");
	list.printDLL(list.head);
	System.out.println("");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the target sum: ");
	int target = sc.nextInt();
	
	ArrayList<ArrayList<Integer>> myList = list.findPairsWithGivenSum(target, list.head);
	System.out.println("List of pairs is: "+myList);
	

	}

}

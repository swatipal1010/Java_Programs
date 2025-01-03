package LinkedList;

import java.util.Scanner;

public class OddEvenLL {
	
	Node head;
    public static int size;

    OddEvenLL(){
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
        
        if(numNodes==0) {
        	System.out.println("You choose to create no nodes.");
        	return;
        }

        System.out.println("Enter the value to be stored in the head (first) node: ");
        int headVal = sc.nextInt();
        head = new Node(headVal); // Use the class-level head variable

        Node temp = head;
        for (int i = 2; i <= numNodes; i++) { // Start from 1 since the head node is already created
            System.out.println("Enter the value in the "+i+"th"+" node: ");
            int val = sc.nextInt();
            Node newNode = new Node(val);
            temp.next = newNode;
            temp = newNode;
        }
    }
    
    

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    //Method-1: To create linked list of odd and even indices using two dummy nodes
    public Node oddEvenList(Node head) {
        if(head==null || head.next==null){
            return head;
        }
       Node oddDummy = new Node(-1);
       Node evenDummy = new Node(-1);

        Node tempOdd = oddDummy;
        Node tempEven = evenDummy;

        Node temp = head;
        while(temp!=null){
            tempOdd.next = temp;
            tempOdd = temp;
            temp = temp.next;
            tempEven.next = temp;
            tempEven = temp;
            if(temp!=null){
                temp = temp.next;
            }           
        }
        tempOdd.next = evenDummy.next;
        return oddDummy.next;
    }
    
    //Method-2: To find odd-even linked list
    public Node OddEvenLL(Node head) {
    	if(head==null || head.next==null) {
    		return head;
    	}
    	Node odd = head;
    	Node evenHead = head.next;
    	Node even = evenHead;
    	
    	while(even!=null && even.next!=null) {
    			odd.next = odd.next.next;
        		odd = odd.next;  		
    			even.next = even.next.next;
        		even = even.next;   		
    	}
    	odd.next = evenHead;
    	return head;
    }
    
	public static void main(String[] args) {
		OddEvenLL list = new OddEvenLL();
		list.createNode();
		System.out.println("Odd-Even linked list is: ");
		list.oddEvenList(list.head);
		list.printList();
		
		OddEvenLL list2 = new OddEvenLL();
		list2.createNode();
		System.out.println("Odd-even linked list is: ");
		list2.OddEvenLL(list2.head);
		list2.printList();
	}

}

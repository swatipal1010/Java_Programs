package LinkedList;
import java.util.Scanner;



public class CreateNodes {
    Node head;
    public static int size;

    CreateNodes(){				//Constructor
        this.size = 0;
    }

    class Node {
        String val;
        Node next;

        Node(String val) {
            this.val = val;
            this.next = null;
            size++;				//Each time a node is created, size of LL increases by 1 
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
        String headVal = sc.nextLine();
        head = new Node(headVal); 						// Use the class-level head variable

        Node temp = head;
        for (int i = 2; i <= numNodes; i++) { 			// Start from 2 since the head node is already created
            System.out.println("Enter the value in the "+i+"th"+" node: ");
            String val = sc.nextLine();
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
    
    
    
    //Method to print the size of the existing linked list
    public int getSize() {
    	return size;
    }

    
    
    //Method to add the node at the beginning of the existing linked list
    public void addFirst(String val) {
    	Node newNode = new Node(val);
    	if(head==null) {
    		head = newNode;
    	}
    	else {
    		newNode.next = head;
    		head = newNode;
    	}
    }
    
    
    
    //Method to add the node at the end of the linked list
    public void addTail(String val) {
    	Node newNode = new Node(val);
    	if(head == null) {
    		head = newNode;
    	}else {
    		Node temp = head;
    		while(temp.next!=null) {
    			temp = temp.next;
    		}
    		temp.next =newNode;
    		newNode.next = null;}
    }
    
    
    
    //Method to delete the node from the starting of the already existing linked list
    public void deleteFirst() {
    	if(size==0) {
    		System.out.println("No node exists in the linked list");
    		return;
    	}
    	head = head.next;
    	size--;
    }
  
    
    
    //Method to delete the last node from the existing linked list
    public void deleteTail() {
    	if(size==0) {
    		System.out.println("You have no nodes in the linked list i.e nothing to delete");
    		return;
    	}
    	Node secondLast= head;
    	Node last = secondLast.next;
    	while(last.next!=null) {
    		secondLast = last;
    		last = last.next;
    	}
    	secondLast.next = null;
    	size--;
    }
    
    
    
    //Method to find the value of a particular node
    public void getValue(int index) {
    	if(index<0 || index>=size) {
    		System.out.println("Invalid index value");
    		return;
    	}else {
    		Node temp = head;
    		int count = 0;
    		while(count!=(index+1)) {
    			if(count==index) {
    				System.out.println("Value stored at the index "+index+" is: "+temp.val);
    			}
    			temp = temp.next;
    			count++;
    		}
    	}
    }
    
    
    
 // Method to insert a value at some random place in the linked list
    public void insertAtRandom(int index) {
        if (index >= 0 && index <= size) { 								// Use && instead of || and <= to allow insertion at the end
            System.out.println("Enter the value in the node.");
            Scanner sc = new Scanner(System.in);
            String value = sc.nextLine();

            Node newNode = new Node(value);

            if (index == 0) { // Special case for inserting at the head
                newNode.next = head;
                head = newNode;
            } else {
                int count = 0;
                Node temp = head;

                // Traverse the list to find the node just before the index
                while (count < index - 1) {
                    temp = temp.next;
                    count++;
                }

                // Perform the insertion
                newNode.next = temp.next;
                temp.next = newNode;
            }
        } else {
            System.out.println("You entered an invalid index");
        }
    }

    
    
 // Method to delete a particular node from the linked list
    void deleteAtRandom(int index) {
        if (index < 0 || index >= size) { 				// Check if index is out of bounds
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) { 							// Special case: deleting the head node
            head = head.next;
        } else {
            int count = 0;
            Node temp = head;

            // Traverse the list to find the node just before the index
            while (count < index - 1) {
                temp = temp.next;
                count++;
            }

            // Bypass the node to be deleted
            temp.next = temp.next.next;
        }
        size--;
    }

    
   
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	//Creating a Linked List
        CreateNodes list = new CreateNodes();
        list.createNode();
        list.printList();
        System.out.println(list.getSize());
        System.out.println();
        
        
        //Adding a node at beginning of already existing LL
        System.out.println("Adding a node at the beginning of the already existing linked list: ");
        list.addFirst("LinkedList");
        list.printList();
        System.out.println("Size of the existing linked list is: "+list.getSize());
        System.out.println();
        
        
        //Adding a node at the end of the already existing node
        System.out.println("Adding the node at the end of the already existing linkedlist: ");
        list.addTail("Hurray!!");
        list.printList();
        System.out.println("Size of the existing linked list is: "+list.getSize());
        System.out.println();
        
        
        //Removing the first node from the already existing Linked list
        System.out.println("Removing the first node from the existing linked list: ");
        list.deleteFirst();
        list.printList();
        System.out.println("Size of the existing linked list is: "+list.getSize());
        System.out.println();
        
        
        //Removing last node from already existing linked list
        System.out.println("Removing the last node from the existing linked list: ");
        list.deleteTail();
        list.printList();
        System.out.println("Size of the existing linked list is: "+list.getSize());
        System.out.println();
        
        
        //To get a value stored at random index node in the linked list
        if(size>0) {
        	System.out.println("You have the index value from 0 to "+(size-1));
        	System.out.println("Please select the index value in the range [0,"+(size-1)+"] to get the value at that index in the LL: ");
        	int index = sc.nextInt();
        	list.getValue(index);
        }else {
        	System.out.println("You have no node in the linkedlist");
        }
        
        
        //Inserting a node at random index in linked list
        if(size>0) {
        	System.out.println("You have the index value from 0 to "+(size-1)+". Select any index from this range where you want to insert the new node");
            int index = sc.nextInt();
            list.insertAtRandom(index);
            list.printList();
            System.out.println("Size of the linked list is: "+list.getSize());
        }else {
        	System.out.println("You only have ondex 0 to insert the new node.");
            int index = sc.nextInt();
            list.insertAtRandom(index);
            list.printList();
            System.out.println("Size of the linked list is: "+list.getSize());
        }
        
        
        //Deleting a node from random index in linked list
        if(size>0) {
        	System.out.println("You have the index value from 0 to "+(size-1)+". Select any index from this range where you want to delete the new node");
            int index = sc.nextInt();
            list.deleteAtRandom(index);
            list.printList();
            System.out.println("Size of the linked list is: "+list.getSize());
        }else {
        	System.out.println("You have no node to delete.");
        }
        list.printList();
              
        
    }
}

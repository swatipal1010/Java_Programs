package Queue;

public class QueueUsingLL {
	Node head;
    public static int size;

    QueueUsingLL(){
        this.size = 0;
    }

    //Class to create a node
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
            size++;
        }
    }
    
    //Enqueue - similar to adding node at tail of the linked list
    public void addTail(int val) {
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
    
    
    //Dequeue - similar to removing the element from the beginning of the linked list
    public int deleteFirst() {
    	if(size==0) {
    		System.out.println("No node exists in the linked list");
    		return -1;
    	}
    	int result = head.val;
    	head = head.next;
    	size--;
    	return result;
    }
    
    
    //Peek-- Getting value of the head node
    public int peek() {
    	if(size==0) {
    		System.out.println("Queue is empty");
    		return -1;
    	}
    	return head.val;
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
    

	public static void main(String[] args) {
		QueueUsingLL q = new QueueUsingLL();
		
		q.addTail(1);
		q.addTail(2);
		q.addTail(3);
		q.addTail(4);
		System.out.println("Size of the existing queue is: "+q.getSize());
		q.printList();
		
		int removedElement = q.deleteFirst();
		System.out.println("Element rempved from the queue is: "+removedElement);
		System.out.println("Size of the existing queue is: "+q.getSize());
		q.printList();
		
		System.out.println("First element of the queue is: "+q.peek());
		
		

	}

}

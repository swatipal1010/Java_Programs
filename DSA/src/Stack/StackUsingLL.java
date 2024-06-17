package Stack;

public class StackUsingLL {

	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	static class Stack{
		public static Node head;
		
		//method to check if the stack(LL) is already empty or not
		public static boolean isEmpty() {
			return head==null;
		}
		
		//push operation
		public static void push(int data) {
			Node newNode = new Node(data);
			if(isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}
		
		//pop operation
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}
		
		//peep operation
		public static int peep() {
			if(isEmpty()) {
				return -1;
			}
			return head.data;
		}
	}
	
	
	
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		//To print the elements from the stack along with making it empty
		while(!s.isEmpty()) {
			//System.out.println(s.peep());
			System.out.println(s.pop());
		}
	}	

}

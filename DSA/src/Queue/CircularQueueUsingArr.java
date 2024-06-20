package Queue;

import Queue.QueueUsingArray.Queue;

public class CircularQueueUsingArr {
	
	public static class Queue{
		static int size;
		static int arr[];
		static int rear = -1;
		static int front =-1;
		
		Queue(int size){
			this.size = size;
			arr= new int[size]; 
		}
		
		//Method to check if the queue is empty or not
		public static boolean isEmpty() {
			return rear==-1 && front==-1;
		}
		
		//method to check if the queue is full or not
		public static boolean isFull() {
			return (rear+1)%size==front;
		}
		
		//Enqueue
		public static void add(int data) {
			if(isFull()) {
				System.out.println("Queue is full");
				return;
			}else {
				//To add 1st element in the queue
				if(front==-1) {
					front =0;
				}
				rear = (rear+1)%size;
				arr[rear] = data;
			}		
		}
		
		//Dequeue
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int result = arr[front];
			//Single element condition
			if(rear==front) {
				front=-1;
				rear =-1;
			}else {
				front = (front+1)%size;
			}
			
			return result;
		}
		
		//peek function
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is full");
				return -1;
			}
			return arr[front];
		}
		}
		
	
	public static void main(String[] args) {
Queue q = new Queue(5);
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);;
		q.add(5);
		
		for(int i =0; i<5; i++) {
			System.out.println(q.peek());
			q.remove();
		}
		


	}

}

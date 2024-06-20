package Queue;

public class QueueUsingArray {
	
	public static class Queue{
		static int size;
		static int arr[];
		static int rear = -1;
		
		Queue(int size){
			this.size = size;
			arr= new int[size]; 
		}
		
		//Method to check if the array is empty
		public static boolean isEmpty() {
			return rear==-1;
		}
		
		//Enqueue
		public static void enqueue(int data) {
			if(rear==size-1) {
				System.out.println("Queue is full");
				return;
			}
			else {
				rear++;
				arr[rear] = data;
			}
		}
		
		//Dequeue
		public static int dequeue() {
			if(isEmpty()) {
				System.out.println("There's no element in the queue to be removed");
				return -1;
			}else {
				int front =arr[0];
				for(int i=0; i<rear;i++) {
					arr[i]=arr[i+1];
				}
				rear--;
				return front;
			}
			
		}
		
		//Peek function
		public static int peek() {
			if(isEmpty()) {
				System.out.println("There's no element in the queue");
				return -1;
			}else {
				return arr[0];
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Queue q = new Queue(5);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);;
		q.enqueue(5);
		
		for(int i =0; i<5; i++) {
			System.out.println(q.peek());
			q.dequeue();
		}

	}

}

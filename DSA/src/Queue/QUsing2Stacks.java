package Queue;
import java.util.Stack;

public class QUsing2Stacks {

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // Method to check if the queue is empty or not
        public static boolean qisEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        // Method to push the data into the queue
        public static void pushQ(int data) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // Push the new data into s1
            s1.push(data);
            // Move everything back to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Method to pop the element from the queue
        public static int popQ() {
            if (qisEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                return s1.pop();
            }
        }

        // Method to retrieve the element from the queue
        public static int peekQ() {
            if (qisEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                return s1.peek();
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.pushQ(1);
        q.pushQ(2);
        q.pushQ(3);
        q.pushQ(4);

        while (!q.qisEmpty()) {
            System.out.println(q.peekQ());
            q.popQ();
        }
    }
}

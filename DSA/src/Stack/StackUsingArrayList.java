package Stack;

import java.util.ArrayList;

public class StackUsingArrayList {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<Integer>();

        // To check if the stack is empty or not
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push operation
        public static void push(int data) {
            list.add(data);
        }

        // pop operation
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1); // Corrected to remove by index
            return top;
        }

        // peek operation
        public static int peek() { // Changed to static
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

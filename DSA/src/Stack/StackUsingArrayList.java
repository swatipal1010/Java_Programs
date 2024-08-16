package Stack;

import java.util.ArrayList;
import java.util.Scanner;

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
                return -1;		//If the arraylist(i.e. stack) is empty, we have nothing to pop out
            }

            int top = list.get(list.size() - 1);		//top element is the last element of the arrayList
            list.remove(list.size() - 1); 				// Corrected to remove by index
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in stack: ");
        int size = sc.nextInt();
        if(size!=0) {
        	System.out.println("Enter "+size+" elements into the stack: ");
        	while(size!=0) {
        		int val = sc.nextInt();
        		s.push(val);
        		size--;
        	}
        }
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
        
        System.out.println("Elements in the stack are: ");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

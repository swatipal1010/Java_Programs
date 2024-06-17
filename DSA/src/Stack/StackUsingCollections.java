package Stack;
import java.util.Stack;

public class StackUsingCollections {

    // Define the isEmpty method to accept a stack as a parameter
    public static boolean isEmpty(Stack<Integer> stack) {
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        // Declare the stack inside the main method
        Stack<Integer> s = new Stack<>();

        // Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // Pop and print elements from the stack
        while (!isEmpty(s)) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

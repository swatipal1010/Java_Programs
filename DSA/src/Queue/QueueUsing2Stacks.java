package Queue;
import java.util.*;

public class QueueUsing2Stacks {
	
	private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsing2Stacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

	
	
	public static void main(String[] args) {
		QueueUsing2Stacks q = new QueueUsing2Stacks();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.pop();
		}

	}

}

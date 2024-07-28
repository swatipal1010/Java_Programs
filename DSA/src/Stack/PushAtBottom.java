package Stack;
import java.util.*;

public class PushAtBottom {

	public static void pushAtBottom(int data, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		
		int top = s.pop();
		pushAtBottom(data, s);			//Recursive call
		s.push(top);
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println("Enter the element to be inserted at the bottom of the stack: ");
		Scanner sc = new Scanner(System.in);
		int data =sc.nextInt();
		
		pushAtBottom(data, s);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}

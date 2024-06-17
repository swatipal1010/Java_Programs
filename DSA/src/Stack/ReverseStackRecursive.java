package Stack;

import java.util.Stack;

public class ReverseStackRecursive {

	//Method to push the data at the bottom of the stack
		public static void pushAtBottom(int data, Stack<Integer> s) {
			if(s.isEmpty()) {
				s.push(data);
				return;
			}
			
			int top = s.pop();
			pushAtBottom(data, s);			//Recursive call
			s.push(top);
		}
		
		//Reversing stack using recursive function and no extra stack
		public static void reverseStack2(Stack<Integer> s) {
			if(s.isEmpty()) {
				return;
			}
			
			int top = s.pop();
			reverseStack2(s);
			pushAtBottom(top, s);
		}
		
	
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		
		System.out.println("Original stack: ");
		while(!s1.isEmpty()) {
			System.out.println(s1.peek());
			s1.pop();		
		}
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		
		System.out.println("Reversing back the stack again using recursive approach and hence no extra approach: ");
		reverseStack2(s1);
		while(!s1.isEmpty()) {
			System.out.println(s1.peek());
			s1.pop();		
		}

	}

}

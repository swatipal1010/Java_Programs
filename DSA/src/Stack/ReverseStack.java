package Stack;
import java.util.*;

public class ReverseStack {

	//Method-1 Using an extra stack
	public static void reverseStack1(Stack<Integer> s1, Stack<Integer> s2) {
		if(s1.isEmpty()) {
			return;
		}
		int top = s1.pop();
		s2.push(top);
		reverseStack1(s1, s2);
		s1.push(top);
	}
	
	
	
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		
		reverseStack1(s1, s2);
		
		System.out.println("Original stack: ");
		while(!s1.isEmpty()) {
			System.out.println(s1.peek());
			s1.pop();		
		}
		
		System.out.println("Reversed stack: ");
		while(!s2.isEmpty()) {
			System.out.println(s2.peek());
			s2.pop();		
		}
		

	}

}

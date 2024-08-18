package Stack;
import java.util.*;

public class ValidParentheses {
	
	public static boolean validParen(String s) {
		HashMap<Character, Character> mymap = new HashMap<>();
		mymap.put(')','(');
		mymap.put('}','{');
		mymap.put(']','[');
		
		Stack<Character> stack = new Stack<>();
		char[] stackArr = s.toCharArray();
		
		for(int i=0; i<stackArr.length; i++) {
			if(stackArr[i]=='(' || stackArr[i]=='{' || stackArr[i]=='[') {
				stack.push(stackArr[i]);
			}else {
				if(stack.isEmpty() || stack.peek()!=mymap.get(stackArr[i])) {
					return false;
				}
				stack.pop();
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string of parentheses: ");
		String input = sc.nextLine();
		
		System.out.println(input+ " has valid set of parentheses? "+ validParen(input));

	}

}

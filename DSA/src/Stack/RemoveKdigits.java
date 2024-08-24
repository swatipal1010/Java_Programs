package Stack;
import java.util.Stack;
import java.util.Scanner;

public class RemoveKdigits {

	public static String removeKdigits(String num, int k) {
        // Edge case: if k equals num's length, remove all digits
			if (k == num.length()) {
					return "0";
			}

			Stack<Character> stack = new Stack<>();

			for (char digit : num.toCharArray()) {
				// Remove digits from the stack while they are larger than the current digit
				// and we still have digits to remove
				while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
					stack.pop();
					k--;
				}
				stack.push(digit);
			}

			// If there are still digits to remove, remove them from the end of the result
			while (k > 0) {
				stack.pop();
				k--;
			}

			// Construct the final number from the stack
			StringBuilder str = new StringBuilder();
			while (!stack.isEmpty()) {
				str.append(stack.pop());
			}

			// Reverse the string to get the correct order
			str.reverse();

			// Remove leading zeros
			while (str.length() > 1 && str.charAt(0) == '0') {
				str.deleteCharAt(0);
			}
			return str.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String number = sc.nextLine();
		//sc.nextLine();
		
		System.out.println("Enter the value of k(no. of digits to be removed from the number): ");
		int k = sc.nextInt();
		
		System.out.println("Minimum number after removing "+k+" digits: "+removeKdigits(number, k));
		

	}

}

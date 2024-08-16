package Stack;
import java.util.Stack;
import java.util.Scanner;

//Calculate the value of the Reverse Polish Notation(postfix notation) which is represented as the array of strings

public class ReversePolishNotation {
	
	public static int evalRPN(String[] tokens) {
        Stack<Integer> newS = new Stack<>();

        int i, a, b;
        for (String tok: tokens) {
            if(tok.equals("+")){
                int n1 = newS.pop();
                int n2 = newS.pop();
                int result = n2+n1;
                newS.push(result);
            }else if(tok.equals("-")){
                int n1 = newS.pop();
                int n2 = newS.pop();
                int result = n2-n1;
                newS.push(result);
            }else if(tok.equals("*")){
                int n1 = newS.pop();
                int n2 = newS.pop();
                int result = n2*n1;
                newS.push(result);
            }else if(tok.equals("/")){
                int n1 = newS.pop();
                int n2 = newS.pop();
                int result = n2/n1;
                newS.push(result);
            }else{
                newS.push(Integer.parseInt(tok));
            }
        }
        return newS.pop();
    }
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the array that contains postfix notation: ");
	        int size = sc.nextInt();
	        sc.nextLine(); // Consume the leftover newline character

	        String arr[] = new String[size];

	        System.out.println("Enter " + size + " elements in the array representing postfix notation: ");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextLine();
	        }

	        int val = evalRPN(arr);
	        System.out.println("Value of the postfix notation is: " + val);

	}
}

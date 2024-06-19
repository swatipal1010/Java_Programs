package Stack;
import java.util.*;

public class InfixToPostfix {

    static Stack<Character> s = new Stack<>();
    static Stack<Integer> newS = new Stack<>();

    public static int precedence(char operator) {
        final Map<Character, Integer> precedenceMap = new HashMap<>();
        precedenceMap.put('(', 0);  // Left parenthesis
        precedenceMap.put(')', 0);  // Right parenthesis
        precedenceMap.put('+', 1);  // Addition
        precedenceMap.put('-', 1);  // Subtraction
        precedenceMap.put('*', 2);  // Multiplication
        precedenceMap.put('/', 2);  // Division
        precedenceMap.put('%', 2);  // Modulus
        //precedenceMap.put('^', 3);  // Exponentiation (Note: Java doesn't support ^ for exponentiation directly)

        return precedenceMap.getOrDefault(operator, -1);  // Return -1 for undefined operators
    }

    public static char[] funcPostFix(char[] infix) {
        int len = infix.length;
        char[] retPostFix = new char[len];
        int j = 0;
        char next;

        for (int i = 0; i < len; i++) {
            char symbol = infix[i];

            switch (symbol) {
                case '(':
                    s.push(symbol);
                    break;
                case ')':
                    while ((next = s.pop()) != '(') {
                        retPostFix[j++] = next;
                    }
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '%':
                    while (!s.isEmpty() && precedence(s.peek()) >= precedence(symbol)) {
                        retPostFix[j++] = s.pop();
                    }
                    s.push(symbol);
                    break;
                default:
                    retPostFix[j++] = symbol;
                    break;
            }
        }
        while (!s.isEmpty()) {
            retPostFix[j++] = s.pop();
        }

        return Arrays.copyOf(retPostFix, j);
    }

    
    
    public static int postfixValue(char[] postfixArr) {
        int i, a, b;
        for (i = 0; i < postfixArr.length; i++) {
            if (postfixArr[i] >= '0' && postfixArr[i] <= '9') {
                newS.push(postfixArr[i] - '0');
            } else {
                a = newS.pop();
                b = newS.pop();
                switch (postfixArr[i]) {
                    case '+':
                        newS.push(b + a);
                        break;
                    case '-':
                        newS.push(b - a);
                        break;
                    case '*':
                        newS.push(b * a);
                        break;
                    case '/':
                        newS.push(b / a);
                        break;
                    case '%':
                        newS.push(b % a);
                        break;
                }
            }
        }
        return newS.pop();
    }

    
    
    public static void main(String[] args) {
        System.out.println("Enter an infix notation: ");
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();

        char[] postfixArr = new char[infix.length()];
        char[] infixArr = infix.toCharArray();

        postfixArr = funcPostFix(infixArr);

        System.out.print("Postfix notation: ");
        for (char c : postfixArr) {
            System.out.print(c);
        }
        System.out.println();

        int operation = postfixValue(postfixArr);
        System.out.println("Value of the postfix expression is: " + operation);
    }
}

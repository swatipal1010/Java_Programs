package Stack;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortStack {

	//METHOD TO SORT THE STACK SUCH THAT TOP ELEMENT IS THE GREATEST ELEMENT OF THE STACK
	public static void sortStack(Stack<Integer> s) {
		ArrayList<Integer> sortedVals = new ArrayList<>();
		int n = s.size();
		for(int i=0; i<n;i++) {
			sortedVals.add(s.pop());
		}
		Collections.sort(sortedVals);
		for(int val: sortedVals) {
			s.push(val);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the stack: ");
		int size = sc.nextInt();
		Stack<Integer> myStack = new Stack<>();
		
		System.out.println("Enter "+size+" elements into the stack: ");
		for(int i=0; i<size;i++) {
			myStack.push(sc.nextInt());
		}
		
		sortStack(myStack);
		//System.out.println("Sorted stack is: "+myStack);
		System.out.print("Sorted stack is: ");
		for(int i=0; i<size;i++) {
			System.out.print(myStack.pop()+" ");
		}

	}

}

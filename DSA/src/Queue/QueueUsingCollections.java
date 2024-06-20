package Queue;
import java.util.*;


public class QueueUsingCollections {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		
		Queue<Integer> q2 = new ArrayDeque<>();
		q2.add(10);
		q2.add(100);
		q2.add(1000);
		while(!q2.isEmpty()) {
			System.out.println(q2.peek());
			q2.remove();
		}
	}

}

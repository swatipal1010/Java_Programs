package revision;

public class GotoAsBreak {

	public static void main(String[] args) {
		boolean t = true;
		first: {
			second: {
				third: {
					System.out.println("Before the break");
					if(t) break second;
					System.out.println("Inside the third label. This won't execute");
				}
				System.out.println("Inside the second label and outside the third label. This won't execute");
			}
			System.out.println("Inside the first label and outside the second label. This gets executed.");
		}
		System.out.println("Outside first label");
			

	}

}

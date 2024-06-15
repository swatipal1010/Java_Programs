package revision;

public class LocalClass {

	public static void main(String[] args) {
		class Local {
			int y =10;
			public void display() {
				System.out.println("Value of y is: "+y);
			}
			
		}
		Local obj = new Local();
		obj.display();

	}

}

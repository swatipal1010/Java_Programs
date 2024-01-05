package Inheritance;

public class StaticBinding {
private void display() {
	System.out.println("Inside the class");
}
	public static void main(String[] args) {
		StaticBinding obj = new StaticBinding();
		obj.display();

	}

}

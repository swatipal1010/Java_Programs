package InterFace;

interface intface1 {
	void show();
	default void display() {
		System.out.println("Hello from Interface intface1");
	}
}

class DefaultMethod implements intface1{
	public void show() {
		System.out.println("Method show() from interface 'intface1'");
	}
	
	void display() {				//Not possible as implementing class has method with name as the default method of interface
		System.out.println("Hello from implementing class DefaultMethod");
	}
}
public class IntfWithDefault2 {

	public static void main(String[] args) {
		intface1 obj = new DefaultMethod();
		obj.display();

	}

}

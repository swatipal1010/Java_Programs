package InterFace;

interface intf1{
	void method1();
	default void display() {
		System.out.println("Hello! Good morning.");
	}
}

interface intf2 extends intf1{
	void method2();
	default void display() {
		System.out.println("Hello! Good Evening.");
	}
}

class Implementing implements intf1, intf2{
	public void method1() {
		System.out.println("This method is from intf1");
	}
	public void method2() {
		System.out.println("This method is from intf2");
	}
}


public class InterfaceWithDefault {

	public static void main(String[] args) {
		intf1 obj1 = new Implementing();
		obj1.display();					//Displays intf2 display() method
										/*interface intf1 & intf2 have same default method display() and intf1 default method has been
										extended to intf2 thus, intf2 default method is always prioritized */
		intf2 obj2 = new Implementing();	//Displays intf2 display() method
		obj2.display();

	}

}

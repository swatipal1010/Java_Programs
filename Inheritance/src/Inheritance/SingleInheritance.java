package Inheritance;
class DemoA{
	void displayA() {
		System.out.println("Superclass method");
	}
}
//Single Inheritance
class DemoB extends DemoA{
	void displayB() {
		System.out.println("Subclass method");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		DemoA obj1 = new DemoA();
		obj1.displayA();
		DemoB obj2 = new DemoB();
		obj2.displayB();

	}

}

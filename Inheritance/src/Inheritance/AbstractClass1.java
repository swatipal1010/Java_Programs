package Inheritance;
abstract class Demo{
	abstract public void display();				//Abstract method
	
	public int display1(int x, int y) {
		int a = x;
		int b = y;
		return a+b;
	}
}


public class AbstractClass1 extends Demo {
	public void display() {										//Abstract method implementation
		System.out.println("Hello, This is Abstract Class");
	}
	public static void main(String[] args) {
		AbstractClass1 obj = new AbstractClass1();
		obj.display();
		System.out.println("The sum of a and b is: "+obj.display1(10,6));

	}

}

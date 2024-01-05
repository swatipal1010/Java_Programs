package classes;

class Outer{
	int outer_x = 100;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	
	class Inner{
		void display() {
			System.out.println("Value of x is: "+outer_x);
		}
	}
}
public class NestedClass {

}

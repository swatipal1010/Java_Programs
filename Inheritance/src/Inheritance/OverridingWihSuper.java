package Inheritance;
class M {
	void display() {
		System.out.println("This is class X");
		System.out.println();
	}
}

class N extends M{
	void display() {
		System.out.println("This is class Y");
		super.display();  							//Execute method of superclass X
		System.out.println();
	}
								
}

class P extends N{
	void display() {
		System.out.println("This is class Z");
		super.display(); 							//Executes method 'display' of superclass Y
		System.out.println();
	}
}


public class OverridingWihSuper {

	public static void main(String[] args) {
		M obj1 = new M();
		N obj2 = new N();
		P obj3 = new P();
		
		obj1.display();
		obj2.display();
		obj3.display();

	}

}

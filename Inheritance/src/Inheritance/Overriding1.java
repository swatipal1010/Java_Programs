package Inheritance;
class X{
	void display() {
		System.out.println("This is class X");
	}
}

class Y extends X{
	void display() {
		System.out.println("This is class Y");
	}
}

class Z extends Y{
	void display() {
		System.out.println("This is class Z");
	}
}


public class Overriding1 {

	public static void main(String[] args) {
	X obj1 = new X();
	Y obj2 = new Y();
	Z obj3 = new Z();
	
	obj1.display();
	obj2.display();
	obj3.display();
	
	obj1 = new Y();			//obj1 is assigned reference of class Y
	obj1.display();			//Method display called by obj1
	
	obj2 = new Z();			//obj2 is assigned reference of class Z
	obj2.display();			//Method display is called by obj2
	}

}

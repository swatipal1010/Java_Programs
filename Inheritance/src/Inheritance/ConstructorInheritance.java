package Inheritance;
class First{
	First(){
		System.out.println("First");
	}
}

class Second extends First{
	Second(){
		System.out.println("Second");
	}
}

class Third extends Second{
	Third(){
		System.out.println("Third");
	}
}


public class ConstructorInheritance {

	public static void main(String[] args) {
		System.out.println("Constructors called for creating constructor of Third class");
		Third th = new Third();
		
		System.out.println("Constructors called for creating constructor of Second class");
		Second sc = new Second();

	}

}

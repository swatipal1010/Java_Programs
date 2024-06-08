interface MyInterface{
	public void greet();
	
	int val = 100;
	
	default public void method() {
		System.out.println("This is the default method that has an implementation within the interface.\nYou can override it in the class where this interface is implmented.");
	}
}

class MyClass implements MyInterface{
	public void greet() {
		System.out.println("Hey Everyone!!");
	}
}

public class DefaultMethodInInheri {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.method();
		obj.greet();
		System.out.println(obj.val);
		//obj.val =200;					//Fields or Properties in the interface are final and cannot be changed

	}

}

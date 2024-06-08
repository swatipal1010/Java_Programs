
class MyClass1{
	MyClass1(){
		System.out.println("I am in class 'MyClass1'.");
	}
	MyClass1(int x){
		System.out.println("I am in class 'MyClass1' and value of x is: "+x);
	}
}

class MyClass2 extends MyClass1{
	MyClass2(){
		System.out.println("I am in class 'MyClass2'");
	}
	MyClass2(int x, int y){
		super(x);
		System.out.println("I am in class 'MyClass2' and value of x and y is: "+x+" "+y);
	}
}

class MyClass3 extends MyClass2{
	MyClass3(){
		System.out.println("I am in class 'MyClass3'");
	}
	MyClass3(int x, int y, int z){
		super(x,y);
		System.out.println("I am in class 'MyClass3' and value of x, y and z are: "+x+" "+y+" "+z);
	}
}



public class ConstructorInheritance {
	public static void main(String[] args) {
		//MyClass1 obj1 = new MyClass1(5);
		
		//MyClass2 obj2 = new MyClass2(3,4);
		
		MyClass3 obj3 = new MyClass3(2,3,4);
	}

}

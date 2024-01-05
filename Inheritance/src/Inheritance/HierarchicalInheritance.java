package Inheritance;

class A{
	public int i, j;
	void setVal(int x, int y) {
		i = x;
		j = y;
	}
	public int sum() {
		return i+j;
	}
}

class B extends A{
	public int product(int x, int y) {
		int p = i*j;
		return p;
	}
}

class C extends A{
	public int div(int x, int y) {
		int d = i/j;
		return d;
	}
	
	public int difference(int x, int y) {
		int diff = i-j;
		return diff;
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		B objb = new B();
		objb.setVal(10,9);
		System.out.println("The product of two numbers is: "+objb.product(10,7)); //Method setVal() assigns the values to i and j which is
																				//inherited by class B. This changing value in product()
																				//method has no effect on result. Values set by setVal() are considered.
		C objc = new C();
		objc.setVal(35,7);
		System.out.println("The Division of two numbers is: "+objc.div(35,7));
		System.out.println("The difference of two numbers is: "+objc.difference(35,7));
	}

}

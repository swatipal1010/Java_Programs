package classes;
class OverloadDemo{
	void test() {
		System.out.println("No parameters");
	}
	
	//Overloading method test by passing one int parameter
	void test(int a){
		System.out.println("a: "+a);
	}
	
	//Overloading method test by passing 20int parameters
	void test(int a, int b) {
		System.out.println("a: " +a+ "b: " +b);
	}
	
	//Overloading method test by passing double value
	double test(double a) {
		System.out.println("double a: "+a);
		return a*a;
	}
}


public class Overload {

	public static void main(String[] args) {
		OverloadDemo ob = new OverloadDemo();
		double result;
		
		//call all versions of test()
		ob.test();
		ob.test(5);
		ob.test(2, 4);
		result = ob.test(8.72);
		System.out.println("Result of ob.test(8.72) is: "+result);
	}

}

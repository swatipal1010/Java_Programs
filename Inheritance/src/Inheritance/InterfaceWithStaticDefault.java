package Inheritance;
interface I1{
	static int compute(int y) {
		return y*y*y;
	}
}

interface I2{
	final static double PI = 3.141;
	default double area(int x) {
		return PI*x*x;
	}
	static void display() {
		System.out.println("Square root of 10 is : "+Math.sqrt(10.0));
	}
}


public class InterfaceWithStaticDefault implements I1, I2 {

	public static void main(String[] args) {
		InterfaceWithStaticDefault obj = new InterfaceWithStaticDefault();
		System.out.println("Cube of 4 is: "+I1.compute(4));
		System.out.println("Area of square with radius 2 is : "+obj.area(2));
		I2.display();

	}

}

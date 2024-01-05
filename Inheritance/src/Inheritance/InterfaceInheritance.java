package Inheritance;

interface New1{
	double pi = 3.141;
}

interface New2 extends New1{
	double radius = 10.0;
}

interface New3 extends New1, New2{
	double area();								//Abstract method
	static public double circumference() {
		return 2*pi*radius;
	}
}


public class InterfaceInheritance implements New3 {
	public double area() {
		return pi*radius*radius;
	}
	public static void main(String[] args) {
		InterfaceInheritance obj = new InterfaceInheritance();
		System.out.println("Area of circle is: "+obj.area());
		System.out.printf("Circumference of circle with radius 10 = %.3f\n", New3.circumference());
		
	}

}

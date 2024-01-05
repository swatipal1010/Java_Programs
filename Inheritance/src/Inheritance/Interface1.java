package Inheritance;

interface E{
	double Pi = 3.141;
}

interface F{
	double radius = 10.0;
}

interface G{
	double area();
}

class Circle implements E, F, G {
	public double area() {
		return Pi*radius*radius;
	}
}

//CLASS WITH main() method
public class Interface1 {

	public static void main(String[] args) {
		Circle obj = new Circle();
		System.out.println("Area of the circle is: "+obj.area());

	}

}

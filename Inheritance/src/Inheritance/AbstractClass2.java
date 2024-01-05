package Inheritance;

abstract class Shape{
	double d;
	int sides;
	Shape(double x, int n){
		d = x;
		sides = n;
	}
	abstract double area();			//Abstract method 'area'
}

class Polygon extends Shape{
	Polygon(double x, int n){
		super(x,n);
	}
	double area() {										//Implementation of abstract method 'area'
		return sides*d*d/(4*Math.tan(3.14159/sides));
	}
}

class Circle1 extends Shape{
	Circle1(double x, int n){
		super(x,n);
	}
	double area() {										//Implementation of abstract method 'area'
		return (3.14159*d*d*sides);
	}
}


public class AbstractClass2 {
	public static void main(String[] args) {
		Circle1 C = new Circle1(10.0,1);				//Object of class circle
		Polygon Triangle = new Polygon(10.0,3);		//Object of class Polygon with 3 sides with length of each sides 10
		Polygon Square = new Polygon(10.0,4);		//Object of class Polygon is created with 4 sides
		Polygon Hexagon = new Polygon(10.0,6);		//Object of class Polygon is created with 6 sides 
		
		Shape RefShape;								//Abstract class reference
		RefShape = Triangle;
		System.out.println("Area of triangle is: "+RefShape.area());
		
		RefShape = Square;
		System.out.println("Area of square is: "+RefShape.area());
		
		RefShape = Hexagon;
		System.out.println("Area of hexagon is: "+RefShape.area());
		
		RefShape = C;
		System.out.println("Area of circle is: "+RefShape.area());
	}

}

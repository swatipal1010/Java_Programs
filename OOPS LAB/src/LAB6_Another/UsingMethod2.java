package LAB6_Another;
import LAB6.*;

public class UsingMethod2 {

	public static void main(String[] args) {
		NumberCube obj1 = new NumberCube();
		int val1 = obj1.cube(3);
		System.out.println("Cube of integer value 3 is : "+val1);
		
		NumberCube obj2 = new NumberCube();
		double val2 = obj2.cube2(5.5);
		System.out.println("Cube of double number 5.5 is : "+val2);
	}

}

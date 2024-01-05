package InterFace;
interface sphere{
	double surfaceAreaSphere(double radius);
	double volumeSphere(double radius);
	void setValue(int side);
}

public class StubMethods {
	// stub method 'surfaceAreaSphere'
	int surfaceAreaSphere(int radius) {
		return 0;
	}
	
	//Method 'volumeSphere' implemented and defined
	double volumeSphere(double radius) { 
		return 4*Math.PI*Math.pow(radius,3)/3;
	}
	
	//stub method 'setValue'
	void setValue(int side) { }
	
	//main() method
	public static void main(String args[]) {
		StubMethods stm = new StubMethods();
		System.out.println("Volume of the sphere with radius 10.0 is : "+ stm.volumeSphere(10.0));
	}
}

package MyPrep;

public class AccessingPrivateMembers {

	public static void main(String[] args) {
		Farm farm1 = new Farm();
		farm1.setSides(40.0,20.0);
		double farmArea = farm1.area();

		System.out.println("Area of the farm is:"+farmArea);
		System.out.println("Length of the farm is: "+farm1.getLength());
		System.out.println("Width of the farm is: "+farm1.getWidth());

	}

}

public class Farm{
	private double length;
	private double width;
	
	public void setSides(double l, double w) {
		length = l;
		width = w;
	}
	
	public double area() {
		return length*width;
	}
	
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
}

package revision;
class Farm1{
	private int length;
	private int breadth;
	
	private int area() {
		return length*breadth;
	}
	
	public void setDim(int l, int b) {
		length = l;
		breadth = b;
	}
	
	//Public method created to access private variable value outside the class
	public int getLength() {
		return length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	
	//Public method to access private method -- area()
	public int getArea() {
		return area();
	}
}
public class AccessPrivateMethod {

	public static void main(String[] args) {
		Farm1 obj = new Farm1();
		obj.setDim(9, 12);
		System.out.println("Value of length: "+obj.getLength()+" and breadth is: "+obj.getBreadth());
		System.out.println("Value of the area of farm is: "+obj.getArea());

	}

}

package revision;

class Farm{
	private int length;
	private int breadth;
	public int area() {
		return length*breadth;
	}
	
	public void setDim(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public int getLength() {					//Public method to return value of private var - length
		return length;
	}
	
	public int getBreadth() {					//Public method to return value of private var - breadth
		return breadth;
	}
}
public class AccessPrivateVar {

	public static void main(String[] args) {
		Farm obj = new Farm();
		obj.setDim(5, 8);
		System.out.println("Value of length is: "+obj.getLength()+" and breadth is: "+obj.getBreadth());
		System.out.println("Area of the farm is: "+obj.area());
		
	}

}

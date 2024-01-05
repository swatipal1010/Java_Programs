package arrays;
class Box2{
	int length;
	int width;
	int height;
	
	//compute and return volume
	int volume() {
		return length*width*height;
	}
	
	//Sets dimension of the box
	void setDim(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
}

public class ParameterizedMethod {
		public static void main(String[] args) {
		Box2 b1 = new Box2();
		Box2 b2 = new Box2();
		int vol;
		
		//initialize each box
		b1.setDim(5, 10, 15);
		b2.setDim(2, 4,8);
		
		//get volume of first box
		vol = b1.volume();
		System.out.println("Volume of the first box: "+vol);
		
		vol = b2.volume();
		System.out.println("Volume of second box: "+vol);
		

	}

}

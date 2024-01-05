package arrays;
class Box1{
	int length;
	int width;
	int height;
	
	//compute and return volume
	int volume() {
		return length*width*height;
	}
}

public class ReturningValue {

	public static void main(String[] args) {
	int vol;
	
	Box1 b1 = new Box1();
	b1.length = 10;
	b1.width = 15;
	b1.height = 18;
	
	Box1 b2 = new Box1();
	b2.length = 5;
	b2.width = 7;
	b2.height = 10;
	
	//get volume of first box
	vol = b1.volume();
	System.out.println("Volume of first box is: "+vol);
	
	//get volume of second box
	System.out.println("Volume of the second box: "+b2.volume());

	}

}

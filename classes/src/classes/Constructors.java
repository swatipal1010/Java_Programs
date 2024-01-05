package classes;
class Box{
	int length;
	int width;
	int height;
	
	//constructor for Box class
Box(){
	System.out.println("Constructing box");
	length = 5;
	width = 6;
	height = 10;
	}

	//compute and return volume
int volume() {
	return length*width*height;
}
}
public class Constructors {

	public static void main(String[] args) {
	Box	b1 = new Box();
	Box b2 = new Box();
	
	int vol;
	
	//Get volume of first box
	vol = b1.volume();
	System.out.println("Volume of box b1 is: "+vol);
	
	vol = b2.volume();
	System.out.println("Volume of box b2 is: "+vol);

	}

}

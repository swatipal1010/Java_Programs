package arrays;
class Box{
	int length;
	int width;
	int height;
	
	//display volume of a box
	void volume() {
		System.out.print("Volume of the box is: ");
		System.out.println(length*width*height);
	}
}
public class Method1 {

	public static void main(String[] args) {
	Box box1 = new Box();
	box1.length = 10;
	box1.width = 15;
	box1.height = 18;
	
	Box box2 = new Box();
	box2.length = 5;
	box2.width = 7;
	box2.height = 10;
	
	//printing volume of box1
	box1.volume();
	
	//printing volume of box2
	box2.volume();

	}

}

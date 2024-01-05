package classes;

class Box100{
	int length;
	int width;
	int height;
	
	int volume() {
		return length*width*height;
	}
	
	void BoxDimensions(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
	
}
public class MethodInClass3 {

	public static void main(String[] args) {
		Box100 box1 = new Box100();
		Box100 box2 = new Box100();
		
		box1.BoxDimensions(5, 4, 8);
		box2.BoxDimensions(6, 7, 3);
		
		System.out.println("Volume of box1 is: "+ box1.volume());
		System.out.println("Volume of box2 is: "+ box2.volume());

	}

}

package classes;
class NewBox{
	int length;
	int width;
	int height;
	int volume() {
		return length*width*height;
	}
}
public class MethodInClass2 {

	public static void main(String[] args) {
		NewBox box1 = new NewBox();
		NewBox box2 = new NewBox();
		
		box1.length = 4;
		box1.width = 5;
		box1.height = 8;
		
		box2.length = 8;
		box2.width = 6;
		box2.height = 2;
		
		System.out.println("Volume of box1 is: "+ box1.volume());
		System.out.println("Volume of box2 is: "+ box2.volume());

	}

}

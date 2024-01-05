package classes;
class Boxes55{
	int length;
	int width; 
	int height;
	
	void volume() {
		System.out.print("The volume is: ");
		System.out.println(length*width*height);
	}
}

public class MethodInClass1 {

	public static void main(String[] args) {
		Boxes55 box1 = new Boxes55();
		Boxes55 box2 = new Boxes55();
		
		box1.length = 4;
		box1.width = 5;
		box1.height = 8;
		
		box2.length = 8;
		box2.width = 6;
		box2.height = 2;
		
		box1.volume();
		box2.volume();
		

	}

}

package revision;
class RedBox{
	int length;
	int width;
	int height;
	
RedBox(){			//Non-Parameterized Constructor
	length = 5;
	width = 2;
	height = 9;
}	
	int volume() {
		return length*width*height;
	}
}


public class ConstructorNonParameterized {
	public static void main(String[] args) {
		RedBox box1 = new RedBox();
		System.out.println("Volume of the box is: "+box1.volume());

	}

}

package classes;
class Box2{
	int length;
	int width;
	int height;
	
	//Creating parameterized constructor
Box2(int l, int w, int h){
	length = l;
	width = w;
	height = h;
}

//computing and returning volume
int volume() {
	return length*width*height;
}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		Box2 b1 = new Box2(5,7,8);
		Box2 b2 = new Box2(6,10,9);
        int vol;
        
        //Getting volume of first box
        vol = b1.volume();
        System.out.println("Volume of first box is: "+vol);
        
        vol = b2.volume();
        System.out.println("Volume of second box is: "+vol);
	}

}

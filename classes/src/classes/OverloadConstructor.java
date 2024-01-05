package classes;
class Box3{
	int length;
	int width;
	int height;


//Constructor of box class when all dimensions are specified
Box3(int l, int w, int h)
{
	length = l;
	width = w;
	height = h;
}

//Constructor when no dimension is specified
Box3(){
	length = -1;
	width = -1;					//-1 is initialized to indicate no dimension allocation
	height = -1;
}

//Constructor when only 1 dimension is specified
Box3(int len){
	length = width = height = len;
}

//Computing and Returning the volume
int volume() {
	return length*width*height;
}
}


public class OverloadConstructor {

	public static void main(String[] args) {
	Box3 b1 = new Box3(10,20,15);
	Box3 b2 = new Box3();
	Box3 b3 = new Box3(7);
	
	//Getting volumes of the boxes
	System.out.println("Volume of box b1 is: "+ b1.volume());
	System.out.println("Volume of box b2 is: "+ b2.volume());
	System.out.println("Volume of box b3 is: "+ b3.volume());
	

	}

}

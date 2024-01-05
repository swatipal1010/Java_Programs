package revision;
class PinkBox{
	int length;
	int width;
	int height;
	
PinkBox(int l, int w, int h){
	length = l;
	width = w;
	height = h;
   }

    int volume() {
	     return length*width*height;
    }
}


public class ConstructorParameterized1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PinkBox box1 = new PinkBox(4,3,9);
		PinkBox box2 = new PinkBox(5,3,1);
		
		System.out.println("Volume of the box1: "+box1.volume());
		System.out.println("Volume of the box2: "+box2.volume());
	}

}

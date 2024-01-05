package revision;
class BlackBox{
	int length;
	int width;
	int height;
	
	int volume() {
		return length*width*height;
	}
	
	//Constructor OVERLOADING
	BlackBox(){							//No dimension specified
		length = -1;
		width = -1;						// -1 to indicate uninitialized box
		height = -1;
	}
	
	BlackBox(int l){					//Single parameter passed-- all 3 dim are same -> Cube formation
		length=width=height = l;
	}
	
	BlackBox(int l, int w, int h){
		length = l;
		width = w;
		height = h;
	}
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		BlackBox box1 = new BlackBox();
		BlackBox box2 = new BlackBox(3);		//wants to get the volume of the cube
		BlackBox box3 = new BlackBox(6,8,2);	//Wants to get the volume of any box
		int vol;
		
		vol = box1.volume();
		System.out.println("Volume is: "+vol);
		
		vol = box2.volume();
		System.out.println("Volume is: "+box2.volume());
		
		vol = box3.volume();
		System.out.println("Volume is: "+box3.volume());
		
		
	}

}

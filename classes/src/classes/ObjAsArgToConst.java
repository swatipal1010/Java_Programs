package classes;
class Boxes{
	int length;
	int width;
	int height;
	Boxes(Boxes o){
		length = o.length;
		width = o.width;
		height = o.height;
	}
	
	Boxes(){
		length = -1;
		width = -1;
		height = -1;
	}
	
	Boxes(int len){
		length=width=height=len;
	}
	
	Boxes(int l, int w, int h){
		length = l;
		width = w;
		height = h;
	}
	
	int volume() {
		return length*width*height;
	}
}

public class ObjAsArgToConst {
	public static void main(String[] args) {
		Boxes b1 = new Boxes(2,5,7);
		Boxes b2 = new Boxes(7);
		Boxes b3 = new Boxes(b1);
		
		//Printing Volume
		System.out.println("Volume of box b1 is "+b1.volume());
		System.out.println("Volume of box b2 is "+b2.volume());
		System.out.println("Volume of box b3 is "+b3.volume());

	}

}

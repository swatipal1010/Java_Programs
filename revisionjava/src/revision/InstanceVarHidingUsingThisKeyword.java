package revision;
class BlueBox{
	int length;
	int width;
	int height;
	
	int volume() {
		return length*width*height;
	}
	
	BlueBox(int length, int width, int height){		//'this' refers to the current object that invokes the method
		this.length = length;						//'this.length' refers to the current object's instance variable length = Assigned
		this.width = width;							// the value received by parameter length
		this.height = height;
	}
}
public class InstanceVarHidingUsingThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlueBox obj = new BlueBox(10,20,15);
		int vol = obj.volume();
		System.out.println("Volume of the box with length: "+obj.length+", width: "+obj.width+", height: "+obj.height+ " is: "+vol);
	}

}

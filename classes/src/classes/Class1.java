package classes;

class Mybox{
	int length;
	int width; 
	int height;
}
public class Class1 {

	public static void main(String[] args) {
		Mybox box1 = new Mybox();				//Creating an object of class type 'Mybox'
		
		//Since each object has a copy of instance variables of the class for which the object has been created
		box1.length = 5;
		box1.width = 7;
		box1.height = 2;
		int volume;
		
		volume = box1.length*box1.width*box1.height;
		System.out.println("Volume of the box is: "+volume);
	}

}

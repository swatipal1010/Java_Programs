package revision;

class ValClass{
	public void manipulateVal(int x, int y) {
		x += 4;
		y += 10;
	}
}

public class PassByValue {

	public static void main(String[] args) {
		ValClass obj = new ValClass();
		int a =5, b= 8;
		
		System.out.println("Value of a and b before passing to the function: "+a+" "+b);
		
		obj.manipulateVal(a, b);
		System.out.println("Value of a and b after passing to the function: "+a+" "+b);
		

	}

}

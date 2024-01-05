package Inheritance;
class New{
	private int i;
	private int j;
	public void setValues(int x, int y) {
		i = x;
		j = y;
	}
	
	public int m;
	void displayA() {
		System.out.println("i = "+i+"\t j = "+j);
		System.out.println("i*j*m = "+(i*j*m));
	}
	
	int getI() {
		return i;
	}
	
	int getJ() {
		return j;
	}
}

class Bb extends New{
	int p;
	void displayP() {
		System.out.println("p = "+p);
	}
	void display() {
		System.out.println("p*m = "+p*m);
	}
}


public class PrivateMembInheritance {

	public static void main(String[] args) {
		New obj1 = new New();
		Bb obj2 = new Bb();
		
		obj1.setValues(4, 5);
		obj1.m = 10;
		obj1.displayA();
		
		obj2.p =5;
		obj2.m = 20;
		obj2.displayP();
		obj2.display();
		obj2.setValues(12, 15);
		System.out.println("j = " + obj2.getI()+ " k = " + obj2.getJ());

	}

}

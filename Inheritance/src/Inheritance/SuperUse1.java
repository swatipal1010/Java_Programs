package Inheritance;
class Sup{
	int i;
	private int j ;
	int k = 2;
	 Sup(int x, int y){
		 i = x;
		 j = y;
	 }
	 
	 int getJ() {
		 return j;
	 }
	 
	 void display() {
		 System.out.println("i = "+i+" \t j = " + j);
		 System.out.println("i*j = "+i*j);
	}
	 
}

class Sub extends Sup{
	private int m;
	int k = 4;
	Sub(int x, int y , int z){
		super(x,y);
		m = z;
	}
	
	void displaySub() {
		System.out.println("Product m*i*j*k = "+(m*getJ()*i*super.k));	//Variable 'k' is defined in class Sup and Sub but to access 
	}																	//Parent class value of 'k' super keyword is used.
}


public class SuperUse1 {

	public static void main(String[] args) {
		Sup obj1 = new Sup(2,3);
		obj1.display();
		
		Sub obj2 = new Sub(5,10,8);
		obj2.displaySub();
	}

}

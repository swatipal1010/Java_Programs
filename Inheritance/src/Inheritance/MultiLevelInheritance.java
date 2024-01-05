package Inheritance;
class Aa1 {
	int j,k;
	void displayA() {
		System.out.println("j = "+ j +"\t k = "+k);
		System.out.println("For A j*k = "+(j*k));
	}
}

class B1 extends Aa1{
	int m;
	int product = k*j*m;
	void displayB() {
		System.out.println("For B product m*j*k" +k*j*m);
	}
}

class C1 extends B1{
	int p;
	void displayC() {
		System.out.println("For C product p*m*j*k" +p*m*j*k);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Aa1 obj1 = new Aa1();
		B1 obj2 = new B1();
		C1 obj3 = new C1();
		
		obj1.j = 5;
		obj1.k = 7;
		obj1.displayA();
		
		obj2.j = 5;
		obj2.k = 8;
		obj2.m = 8;
		obj2.displayB();
		
		obj3.j = 2;			//Since C1 extends B1 which in turn extends Aa1, thus C1 can access the variables defined in Aa1 and B1
		obj3.k = 5;
		obj3.m = 6;
		obj3.p = 9;
		obj3.displayC();

	}

}

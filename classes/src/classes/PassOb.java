package classes;
class Test{
	int a,b;
	
	Test(int i, int j) {
		a = i;
		b = j;
	}
	
	//Return true if o is equal to the invoking object
	boolean equalTo(Test o) {							// type of the parameter o is class (Test)
		if(o.a == a && o.b == b) return true;
		else return false;
	}
}


public class PassOb {

	public static void main(String[] args) {
		Test obj1 = new Test(100, 200);
		Test obj2 = new Test(100, 200);
		Test obj3 = new Test(-1, -1);
		
		System.out.println("obj1 == obj2 :"+ obj1.equalTo(obj2));		// o = obj2 in method equalTo
		System.out.println("obj1 == obj3 :"+ obj1.equalTo(obj3));			// o = obj3 in method equalTo

	}

}

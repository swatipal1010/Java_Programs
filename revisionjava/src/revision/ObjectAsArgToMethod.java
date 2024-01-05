package revision;
class Test{
	int a,b;
	
	Test(int i, int j){
		a = i;
		b = j;
	}
	
	// returns true if 'o' is equal to the invoking object
	boolean equalTo(Test o) {
		if(o.a == a && o.b == b) return true;
		else return false;
	}
}
public class ObjectAsArgToMethod {

	public static void main(String[] args) {
		Test obj1 = new Test(2,4);
		Test obj2 = new Test(2,4);
		Test obj3 = new Test(3,2);
		
		System.out.println("obj1==obj2: "+obj1.equalTo(obj2));
		System.out.println("obj1==obj3: "+obj1.equalTo(obj3));

	}

}

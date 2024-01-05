package classes;
class Test2{
	void method(int i, int j) {
		i *= 2;
		j /= 2;
	}
}

public class PassByValue {

	public static void main(String[] args) {
		Test2 ob = new Test2();
		int a = 15, b = 20;
		System.out.println("a nad b before call : "+a + b);
		ob.method(a, b);
		System.out.println("a nad b after call : "+a + b);
		
		

	}

}

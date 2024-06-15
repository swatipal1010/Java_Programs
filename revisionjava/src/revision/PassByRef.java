package revision;

class Ref{
	int n;
	Ref(int x){
		n = x;
	}
	
	int func(Ref obj) {
		obj.n +=4;
		return n;
	}
}
public class PassByRef {

	public static void main(String[] args) {
		Ref obj1 = new Ref(10);
		
		System.out.println("Value returned by the function is: "+obj1.func(obj1));
		System.out.println("Value returned by the function is: "+obj1.func(obj1));
		System.out.println("Value returned by the function is: "+obj1.n);
		
		Ref obj2 = new Ref(15);
		System.out.println("Value returned by the function is: "+obj2.n);
	}

}

package revision;

public class TypeCasting {

	public static void main(String[] args) {
		int i = 257;
		double d = 323.142;
		int a = 5;
		int b = 2;
		float c;
		float e;
		
		c = (float)a/b;		  // Widening: int to float (implicit casting within the expression)
		e = (float)(a/b);    // Narrowing: int to float (explicit casting required)
		i = (int)d;
		System.out.println("Value of i is: "+i);
		System.out.println("Value of c is: "+c);
		System.out.println("Value of e is: "+e);
		
		char grade = 'C';
		grade = (char)(grade+2);
		System.out.print("grade+2 on typecasting to char yields : "+grade);
		
	}

}

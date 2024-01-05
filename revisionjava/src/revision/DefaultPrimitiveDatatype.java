package revision;

public class DefaultPrimitiveDatatype {
	// Below mentioned variables are instance variables. They don't necessarily needs the initialization at the time of declaration.
	byte a;
	short s;
	int i;
	long l;
	float f;
	double d;
	char b;
	boolean c;
	public static void main(String[] args) {
		
		/*If the above mentioned variables could have been declared here then they are called local variables(local to scope of main method) 
		and they require initialization at the time of declaration.*/
		
		DefaultPrimitiveDatatype obj =new DefaultPrimitiveDatatype();
		System.out.println("Printing the default values of primitive datatypes");
		
		System.out.println("Default value of byte is:"+obj.a);
		System.out.println("Default value of short is:"+obj.s);
		System.out.println("Default value of int is:"+obj.i);
		System.out.println("Default value of long is:"+obj.l);
		System.out.println("Default value of float is:"+obj.f);
		System.out.println("Default value of double is:"+obj.d);
		System.out.println("Default value of char is:"+obj.b);
		System.out.println("Default value of boolean is:"+obj.c);
		
		
		
	
	}

}

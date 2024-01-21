package MyPrep;

public class TypeCasting {

	public static void main(String[] args) {
		int i =10;
		float f = 10.552f;
		double d = 10.1245;
		short s = 32766;
		byte b = 127;
		char c = 'A';
		String str = "12452";
		
		//Automatic/Widening conversion
		int sum = s+b;
		System.out.println("Sum of "+b+" + "+s+" is: "+sum);
		
		int add1 = c+i;
		System.out.println("Sum of "+c+" + "+i+" is: "+add1);
		
		//Explicit/Narrowing conversion
		short add2 = (short)(i+s);
		System.out.println("Sum of "+i+" + "+s+" is: "+add2);
		
		int num2 = Integer.parseInt(str);
		System.out.println("Value of "+str+" in int is: "+num2);
	}

}

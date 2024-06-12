
public class WrapperClass {

	public static void main(String[] args) {
		
		
		//Primitive integer
		int num = 43;
		
		//Creating object of Integer Wrapper class
		Integer objInt = num;		//Auto-boxing - because the primitive integer is itself converted to Wrapper class object
		System.out.println("Object value of "+num+" is: "+objInt);
		
		//Auto-unboxing -- Wrapper class object is itself converted to the primitive datatype
		int num2 = objInt;
		System.out.println("Converting back from object to the primitive datatype: "+num2);
		
		//Using the methods of the Wrapper class
		Integer i1 = Integer.valueOf("123");
		System.out.println("Object value of the string 123 passed to the valueOf() method is: "+i1);
		
		
		//Adding the Integer objects' value together
		Integer sumNums = objInt+i1;
		System.out.println("Adding the two objects' values together: "+sumNums);
		
		Integer binaryObj = Integer.valueOf("100",2);
		System.out.println("Binary value of the string 100 returned as an Integer object is: "+binaryObj);
		
		int num3 = Integer.parseInt("123"); //parseInt() returns the primitive int vale of the passed String
		int num4 = 1+num3;
		System.out.println("Adding the two primitive int datatype values together: "+num4);
		
		//int num5 = Integer.parseInt(i1); 
		
		int num5 = i1.intValue();			//Converting a Integer object value to primitive int datatype
		System.out.println("Converting the object value to its primitive datatype(int): "+num5);
		
		System.out.println(num4+" + "+num5+" = "+(num4+num5));
	}

}

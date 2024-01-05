package classes;
 class StaticVarMethod{
	 static int a =12;
	 static int b = 57;
	 
	 static void callme(){
		 System.out.println("a: "+a);
	 }
 }
public class Static {

	public static void main(String[] args) {
		StaticVarMethod.callme();									//Accessing static method by calling classname without 
																	// creating an object
		System.out.println("Value of b is: "+StaticVarMethod.b);	

	}

}

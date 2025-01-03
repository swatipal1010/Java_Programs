package LAB4;
/**	Consider the trunk calls of a telephone exchange. A trunk call can be ordinary, urgent or lightning.
The charges depend on the duration and the type of the call. 
Write a program using the concept of polymorphism in Java to calculate the charges.**/

public class Lab4_D {
	
	//declare the rate of each call
	int ordinary_rate=23;
	int urgent_rate=43;
	int lighting_rate=54;
	public static void  main(String args[]){
	//make obj and call methods by passing the duration of call
	ordinary o=new ordinary();
	o.charges(3);
	urgent u=new urgent();
	u.charges(4);
	lighting l=new lighting();
	l.charges(6);
	}
}


class ordinary extends Lab4_D{
	//methods
	void charges(int hours){
	System.out.println(ordinary_rate*hours);
	}
}


	class urgent extends Lab4_D{
	void charges(int hours){
	System.out.println(urgent_rate*hours);
	}
}
	
	
	class lighting extends Lab4_D{
	void charges(int hours){
	System.out.println(lighting_rate*hours);
	}
}
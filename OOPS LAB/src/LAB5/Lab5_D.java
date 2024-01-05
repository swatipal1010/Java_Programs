package LAB5;
import java.util.Scanner;

interface test1{//declare interface 
int division(int a,int b);
int modules(int a,int b);
}

class AA implements test{
public  int division(int a,int b){//implement interface
	return a/b;
	}
public int modules(int a,int b){
	return a%b;
  }
}


class B {//class which do not implement 
public  int division(int a,int b){
return a%b;}
public int modules(int a,int b){
return a/b;
}
}


public class Lab5_D{
	public static void main(String args[]){
		System.out.print("Enter two number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
	AA obj=new AA();//call method 
	B obj1=new B();
	System.out.println(obj.division(a,b));
	System.out.println(obj1.division(a,b));//overriding method
	System.out.println(obj.modules(a,b));
	System.out.println(obj1.modules(a,b));
	}
}

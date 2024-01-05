package Mypkg;

public class MyCalc {
	public int sum(int a, int b) {
		return(a+b);
	}
	public int diff(int a, int b) {
		return(a-b);
	}
	public int mul(int a, int b) {
		return(a*b);
	}
	public int div(int a, int b) {
		return(a/b);
	}
	public static void main(String[] args) {
		
		MyCalc obj=new MyCalc();
		System.out.println(obj.sum(10,2));
		System.out.println(obj.diff(10,2));
		System.out.println(obj.mul(10,2));
		System.out.println(obj.div(10,2));
		

	}

}

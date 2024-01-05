package LAB5;

interface test{//declare interface 
int number =100;
}


public class Lab5_C implements test {
	public static void main(String args[]){
		Lab5_C obj =new Lab5_C();
	System.out.println(obj.number=200);//this will give error because by default variable declared in interface is final
	}
}

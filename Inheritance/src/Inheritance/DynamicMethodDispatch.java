package Inheritance;
 class One{
	 void display() {
		 System.out.println("Class One");
	 }
 }
 
 class Two extends One{
	 void display() {
		 System.out.println("Class Two");
	 }
 }
 
 class Three extends Two{
	 void display() {
		 System.out.println("Class Three");
	 }
 }
 
 //CLASS WITH main() method
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		One obj1 = new One();
		Two obj2 = new Two();
		Three obj3 = new Three();
		
		One Ref1 = obj1;		//One class reference assigned obj1 reference
		Ref1.display();
		
		Ref1 = obj2;			//reference obj2 assigned to Ref1
		Ref1.display();
		
		Ref1 = obj3;			//reference obj3 assigned to Ref1
		Ref1.display();

	}

}

package InterFace;

interface Human{
	void speak();
	void sing();
}

interface Monkey{
	void sleep();
	void eat();
}

class BasicAnimal implements Human, Monkey {
	public void speak() {
		System.out.println("Human being can speak");
	}
	
	public void sing() {
		System.out.println("Human being can sing");
	}
	
	public void sleep() {
		System.out.println("Monkey is sleeping..");
	}
	
	public void eat() {
		System.out.println("Monkey is eating the banana..");
	}
}

public class InterfaceWithPolymorphism {
	public static void main(String[] args) {
		Monkey anm1 = new BasicAnimal();	//anm1 is reference to interface Monkey thus can use its methods only
		//  anm1.speak();  --> Throws error
		anm1.eat();
		anm1.sleep();
		
		Human anm2 = new BasicAnimal();
		// anm2.eat() --> Throws error
		anm2.speak();
		anm2.sing();
		
		BasicAnimal anm3 = new BasicAnimal();
		// Reference variable can use any method of the two interfaces
		anm3.sleep();
		anm3.sing();
	}

}

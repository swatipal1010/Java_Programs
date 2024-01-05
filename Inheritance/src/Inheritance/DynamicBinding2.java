package Inheritance;
class Animals {
	void eat() {
		System.out.println("Animal is eating..");
	}
}

class Dog extends Animals{
	void eat() {
		System.out.println("Dog is eating..");
	}
}


public class DynamicBinding2 {

	public static void main(String[] args) {
		Animals a = new Dog();
		a.eat();

	}

}
